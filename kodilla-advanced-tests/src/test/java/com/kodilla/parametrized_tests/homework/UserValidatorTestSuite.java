package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTestSuite {
    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Maria","Maria_Vox", "Maria-Vox", "Maria.Vox","MariaVox","Maria123","Maria Vox","Ma","Maria%Vox"})
    public void testValidateUsername(String username) {
        Map<String, Boolean> userNameValidation = new HashMap<>();
        userNameValidation.put("Maria", true);
        userNameValidation.put("Maria_Vox", true);
        userNameValidation.put("Maria-Vox", true);
        userNameValidation.put("Maria.Vox", true);
        userNameValidation.put("MariaVox", true);
        userNameValidation.put("Maria123", true);
        userNameValidation.put("Maria Vox", false);
        userNameValidation.put("Ma", false);
        userNameValidation.put("Maria%Vox", false);

        boolean result = validator.validateUsername(username);
        boolean expectedResult =  userNameValidation.get(username);
        assertEquals(expectedResult,result);
    }
    @ParameterizedTest
    @CsvSource( {
            "maria.vox@example.com,true",
            "mariavox123@gamil.com,true",
            "maria@,false",
            "mariavox@gmal,false",
    "null,false"})
    public void testValidateEmail(String email, boolean expectedResult) {
        boolean result = validator.validateEmail(email);
        assertEquals( expectedResult,result);
    }



}

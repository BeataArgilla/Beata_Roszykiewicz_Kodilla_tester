package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class EntryDataBMICalculator {
    static Stream<Arguments> providesDataForBMICalculation(){
        return Stream.of(
                Arguments.of(168,89,"Obese Class I (Moderately obese)"),
                Arguments.of(168,35,"Very severely underweight"),
                Arguments.of(168,54,"Normal (healthy weight)"),
                Arguments.of(168,120,"Obese Class II (Severely obese)"),
                Arguments.of(168,77,"Overweight")

        );


    }
}

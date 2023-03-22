package com.kodilla.spring.basic.spring_dependency_injection;
import com.kodilla.spring.basic.spring_dependency_injection.homework.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTest {

    @Autowired
    private Calculator calculator;

    @Test
    void add() {
        calculator.add(2, 3);
    }

    @Test
    void subtract() {
        calculator.subtract(5, 2);
    }

    @Test
    void multiply() {
        calculator.multiply(3, 4);
    }

    @Test
    void divide() {
        calculator.divide(10, 2);
        calculator.divide(5, 0);
    }
}

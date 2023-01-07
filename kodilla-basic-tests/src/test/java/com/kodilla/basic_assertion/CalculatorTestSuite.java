package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSub() {
        Calculator calculator1 = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator1.sub(a, b);
        assertEquals(-3, subResult);
    }
    @Test
    public void testPotega() {
        Calculator calculator2 = new Calculator();
        int c = 5;
        int d = 3;
        double potResult = calculator2.potega(c,d);
        assertEquals(125, potResult);
    }
}

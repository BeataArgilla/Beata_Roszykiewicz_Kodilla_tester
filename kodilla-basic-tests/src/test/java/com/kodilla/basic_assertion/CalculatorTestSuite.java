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
    public void testPowerNumberGreaterThanZero() {
        Calculator calculator2 = new Calculator();
        int a = 5;
        int b = 3;
        double potResult = calculator2.potega(a,b);
        assertEquals(125, potResult);
    }
    @Test
    public void testPowerNumberEqualZero() {
        Calculator calculator2 = new Calculator();
        double a = 0;
        double b = 3;
        double delta =0.1;
        double potResult = calculator2.potega(a,b);
        assertEquals(0, potResult, delta);
    }
    @Test
    public void testPowerNumberSmallerThanZero() {
        Calculator calculator2 = new Calculator();
        double a = -2.2;
        double b = 2;
        double delta =0.0001;
        double potResult = calculator2.potega(a,b);
        assertEquals(4.84, potResult, delta); // po co mi ta delta?
    }
}

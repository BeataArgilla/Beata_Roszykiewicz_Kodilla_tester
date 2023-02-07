package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GamblingMachineTestSuite {
    private GamblingMachine gamblingMachine = new GamblingMachine();


    @ParameterizedTest
    @CsvFileSource(resources = "/EntryData.csv", numLinesToSkip = 1)
    public void testGenerateComputerNumbers(int runs) {
        for (int i = 0; i < runs; i++) {
            Set<Integer> numbers = gamblingMachine.generateComputerNumbers();
            assertEquals(6, numbers.size(), "Wrong size");

        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/EntryData.csv", numLinesToSkip = 1)
    public void testRange(int runs) {
        for (int i = 0; i < runs; i++) {
            Set<Integer> numbers = gamblingMachine.generateComputerNumbers();
            for (int number : numbers) {
                assertTrue(number >= 1 && number <= 49, "Wrong range");
            }
        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/EntryData.csv", numLinesToSkip = 1)
    public void testHowManyWins(Set<Integer> userNumbers, int expected) throws InvalidNumbersException {
        int actual = gamblingMachine.howManyWins(userNumbers);
        assertEquals(expected, actual);

    }
}


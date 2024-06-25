package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class DotInserterTest {

    @Test
    void testInsertDots_GeneratesCombinations_ExpectedNumberWithThreeCharacters() {
        String inputString = "abc";
        List<String> result = DotInserter.insertDots(inputString);

        int expectedNumberOfCombinations = (int) Math.pow(2, inputString.length() - 1);

        assertEquals(expectedNumberOfCombinations, result.size(), "The number of combinations is incorrect");
        assertTrue(result.contains("abc"), "Result should contain 'abc'");
        assertTrue(result.contains("a.bc"), "Result should contain 'a.bc'");
        assertTrue(result.contains("ab.c"), "Result should contain 'ab.c'");
        assertTrue(result.contains("a.b.c"), "Result should contain 'a.b.c'");
    }

    @Test
    void testInsertDots_GeneratesCombinations_ExpectedNumberWithTwoCharacters() {
        String inputString = "ab";
        List<String> result = DotInserter.insertDots(inputString);

        int expectedNumberOfCombinations = (int) Math.pow(2, inputString.length() - 1);

        assertEquals(expectedNumberOfCombinations, result.size(), "The number of combinations is incorrect");
        assertTrue(result.contains("ab"), "Result should contain 'ab'");
        assertTrue(result.contains("a.b"), "Result should contain 'a.b'");
    }

    @Test
    void testInsertDots_GeneratesCombinations_ExpectedNumberWithFourCharacters() {
        String inputString = "abcd";
        List<String> result = DotInserter.insertDots(inputString);

        int expectedNumberOfCombinations = (int) Math.pow(2, inputString.length() - 1);

        assertEquals(expectedNumberOfCombinations, result.size(), "The number of combinations is incorrect");
        assertTrue(result.contains("abcd"), "Result should contain 'abcd'");
        assertTrue(result.contains("a.bcd"), "Result should contain 'a.bcd'");
        assertTrue(result.contains("ab.cd"), "Result should contain 'ab.cd'");
        assertTrue(result.contains("abc.d"), "Result should contain 'abc.d'");
        assertTrue(result.contains("a.b.cd"), "Result should contain 'a.b.cd'");
        assertTrue(result.contains("a.bc.d"), "Result should contain 'a.bc.d'");
        assertTrue(result.contains("ab.c.d"), "Result should contain 'ab.c.d'");
        assertTrue(result.contains("a.b.c.d"), "Result should contain 'a.b.c.d'");
    }
}
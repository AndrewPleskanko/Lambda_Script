package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is responsible for generating all possible combinations of a string with dots inserted between characters.
 */
public class DotInserter {

    /**
     * This method generates all possible combinations of a string with dots inserted between characters.
     *
     * @param inputString The input string.
     * @return A list of strings representing all possible combinations with dots.
     */
    public static List<String> insertDots(String inputString) {
        List<String> result = new ArrayList<>();
        insertDotsHelper(inputString, 0, new StringBuilder(), result);
        return result;
    }

    /**
     * This is a helper method used by the insertDots method. It uses recursion to generate all possible combinations.
     *
     * @param inputString The input string.
     * @param currentIndex The current index in the string.
     * @param currentCombination The current combination being built.
     * @param result The list of all combinations.
     */
    private static void insertDotsHelper(String inputString, int currentIndex, StringBuilder currentCombination, List<String> result) {
        if (currentIndex == inputString.length() - 1) {
            currentCombination.append(inputString.charAt(currentIndex));
            result.add(currentCombination.toString());
            currentCombination.deleteCharAt(currentCombination.length() - 1);
            return;
        }

        currentCombination.append(inputString.charAt(currentIndex));
        insertDotsHelper(inputString, currentIndex + 1, currentCombination.append('.'), result);
        currentCombination.deleteCharAt(currentCombination.length() - 1);
        insertDotsHelper(inputString, currentIndex + 1, currentCombination, result);
        currentCombination.deleteCharAt(currentCombination.length() - 1);
    }
}
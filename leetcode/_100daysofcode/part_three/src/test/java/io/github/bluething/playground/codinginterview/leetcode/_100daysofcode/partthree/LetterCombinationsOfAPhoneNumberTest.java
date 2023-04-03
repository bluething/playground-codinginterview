package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
class LetterCombinationsOfAPhoneNumberTest {

    @Test
    void case01() {
        Assertions.assertEquals(List.of("ad","ae","af","bd","be","bf","cd","ce","cf"), letterCombinations("23"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(Collections.emptyList(), letterCombinations(""));
    }

    @Test
    void case03() {
        Assertions.assertEquals(List.of("a","b","c"), letterCombinations("2"));
    }
    private List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return results;
        }

        String[] letters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        generateCombination(results, new StringBuilder(), letters, digits, 0);
        return results;
    }

    private void generateCombination(List<String> results, StringBuilder sb, String[] letters, String digits, int idx) {
        if (idx == digits.length()) {
            results.add(sb.toString());
            return;
        }

        int digit = digits.charAt(idx) - '0';
        String letter = letters[digit - 2];
        for (int i = 0; i < letter.length(); i++) {
            sb.append(letter.charAt(i));
            generateCombination(results, sb, letters, digits, idx + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

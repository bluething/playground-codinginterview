package io.github.bluething.playground.codinginterview.leetcode.string101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        return Collections.emptyList();
    }
}

package io.github.bluething.playground.codinginterview.leetcode.string101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

class LetterCasePermutationTest {
    @Test
    void case01() {
        Assertions.assertEquals(List.of("a1b2","a1B2","A1b2","A1B2"), letterCasePermutation("a1b2"));
    }
    @Test
    void case02() {
        Assertions.assertEquals(List.of("3z4","3Z4"), letterCasePermutation("3z4"));
    }

    private List<String> letterCasePermutation(String s) {
        return Collections.emptyList();
    }
}

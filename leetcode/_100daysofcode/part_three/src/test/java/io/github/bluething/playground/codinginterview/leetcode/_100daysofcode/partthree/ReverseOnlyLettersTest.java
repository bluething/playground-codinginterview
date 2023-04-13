package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/reverse-only-letters/
class ReverseOnlyLettersTest {

    @Test
    void case01() {
        Assertions.assertEquals("dc-ba", reverseOnlyLetters("ab-cd"));
    }

    @Test
    void case02() {
        Assertions.assertEquals("j-Ih-gfE-dCba", reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

    @Test
    void case03() {
        Assertions.assertEquals("Qedo1ct-eeLg=ntse-T!", reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    private String reverseOnlyLetters(String s) {
        return "";
    }
}

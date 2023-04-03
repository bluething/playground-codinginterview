package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/check-if-a-parentheses-string-can-be-valid/
class CheckIfAParenthesesStringCanBeValidTest {

    @Test
    void case01() {
        Assertions.assertTrue(canBeValid("))()))", "010100"));
    }

    @Test
    void case02() {
        Assertions.assertTrue(canBeValid("()()", "0000"));
    }

    @Test
    void case03() {
        Assertions.assertFalse(canBeValid(")", "0"));
    }

    private boolean canBeValid(String s, String locked) {
        return true;
    }
}

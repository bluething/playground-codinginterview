package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/valid-parenthesis-string/description/
class ValidParenthesisStringTest {

    @Test
    void case01() {
        Assertions.assertTrue(checkValidString("()"));
    }

    @Test
    void case02() {
        Assertions.assertTrue(checkValidString("(*)"));
    }

    @Test
    void case03() {
        Assertions.assertTrue(checkValidString("(*))"));
    }

    private boolean checkValidString(String s) {
        return false;
    }
}

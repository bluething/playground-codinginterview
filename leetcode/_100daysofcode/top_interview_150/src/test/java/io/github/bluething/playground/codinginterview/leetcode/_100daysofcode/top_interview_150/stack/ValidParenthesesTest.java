package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/valid-parentheses/?envType=study-plan-v2&envId=top-interview-150
class ValidParenthesesTest {

    @Test
    void case01() {
        Assertions.assertTrue(isValid("()"));
    }

    @Test
    void case02() {
        Assertions.assertTrue(isValid("()[]{}"));
    }

    @Test
    void case03() {
        Assertions.assertFalse(isValid("(]"));
    }

    @Test
    void case04() {
        Assertions.assertFalse(isValid("]"));
    }

    @Test
    void case05() {
        Assertions.assertFalse(isValid("["));
    }

    private boolean isValid(String s) {
        return true;
    }
}

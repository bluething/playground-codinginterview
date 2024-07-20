package io.github.bluething.playground.codinginterview.leetcode.stackqueue101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        char[] stack = new char[s.length()];
        char[] pairs = new char[128];
        pairs[')'] = '(';
        pairs['}'] = '{';
        pairs[']'] = '[';
        int idx = 0;
        for (char c : s.toCharArray()) {
            // put open to the stack
            if (pairs[c] == 0) {
                stack[idx++] = c;
            // meet close
            } else {
                // close doesn't have pair
                if (idx == 0) {
                    return false;
                // top of the stack have wrong pair
                } else if (stack[idx-1] != pairs[c]) {
                    return false;
                }
                // pop the stack
                idx--;
            }
        }
        return idx == 0;
    }
}

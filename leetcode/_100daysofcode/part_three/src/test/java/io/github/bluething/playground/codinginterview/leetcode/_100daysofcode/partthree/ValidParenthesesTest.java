package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/
public class ValidParenthesesTest {
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
        Stack<Character> parentheses = new Stack<>();
        char popChar;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' ||
                    s.charAt(i) == '{' ||
                    s.charAt(i) == '[') {
                parentheses.push(s.charAt(i));
            } else {
                if (parentheses.isEmpty()) {
                    return false;
                } else {
                    popChar = parentheses.pop();
                    if ((popChar == '(' && s.charAt(i) != ')') ||
                            (popChar == '{' && s.charAt(i) != '}') ||
                            (popChar == '[' && s.charAt(i) != ']')) {
                        return false;
                    }
                }
            }
        }
        if (!parentheses.isEmpty()) {
            return false;
        }
        return true;
    }
}

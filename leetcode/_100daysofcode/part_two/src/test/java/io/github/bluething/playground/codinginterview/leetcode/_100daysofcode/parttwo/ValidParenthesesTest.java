package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.parttwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

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
        Stack<Character> openParnetheses = new Stack<>();
        char open;
        char close;

        for (int i = 0; i < s.length(); i++) {
            open = s.charAt(i);
            if (open == '(' || open == '[' || open == '{') {
                openParnetheses.push(open);
            } else {
                if (openParnetheses.isEmpty()) {
                    return false;
                }
                open  = openParnetheses.pop();
                close = s.charAt(i);
                if ((open == '(' && close != ')') || (open == '[' && close != ']') || (open == '{' && close != '}')) {
                    return false;
                }
            }
        }

        if (!openParnetheses.isEmpty()) {
            return false;
        }

        return true;
    }
}
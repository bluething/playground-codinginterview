package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.parttwo;

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

    @Test
    void case06() {
        Assertions.assertTrue(isValid2("()"));
    }

    @Test
    void case07() {
        Assertions.assertTrue(isValid2("()[]{}"));
    }

    @Test
    void case08() {
        Assertions.assertFalse(isValid2("(]"));
    }

    @Test
    void case09() {
        Assertions.assertFalse(isValid2("]"));
    }

    @Test
    void case010() {
        Assertions.assertFalse(isValid2("["));
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

    private boolean isValid2(String s) {
        char[] stack = new char[s.length()];
        char[] mapping = new char[128];
        mapping[')'] = '(';
        mapping['}'] = '{';
        mapping[']'] = '[';
        int idx = 0;
        for (char sChar : s.toCharArray()) {
            // if current char is close, try to compare with top stack
            // else put the char to top
            if (mapping[sChar] != 0) {
                if (idx == 0) {
                    return false;
                }
                if (stack[idx-1] != mapping[sChar]) {
                    return false;
                }
                idx--;
            } else {
                stack[idx++] = sChar;
            }
        }

        return idx ==0;
    }
}
package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.stack;

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

    private boolean isValid2(String s) {
        char[] sStack = new char[s.length()];
        char[] mapping = new char[128];
        mapping[')'] = '(';
        mapping['}'] = '{';
        mapping[']'] = '[';
        int idx = 0;
        for (char sChar : s.toCharArray()) {
            if (mapping[sChar] == 0) {
                // put open parentheses to the stack
                sStack[idx++] = sChar;
            } else {
                // there are no open parentheses in the stack
                if (idx == 0) {
                    return false;
                }
                // top of the stack have different type of open parentheses
                if (sStack[idx-1] != mapping[sChar]) {
                    return false;
                }
                // move pointer to the top of stack -1
                // this simulate pop operation in Stack
                idx--;
            }
        }

        return idx == 0;
    }
}

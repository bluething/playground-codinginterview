package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

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
    void case10() {
        Assertions.assertFalse(isValid2("["));
    }

    private boolean isValid(String s) {
        Stack<Character> sChars = new Stack<>();
        char current = (char) 0;
        for (int i = 0; i < s.length(); i++) {
            current = s.charAt(i);
            if (current == '(' || current == '[' || current == '{') {
                sChars.push(current);
            } else {
                if (!sChars.isEmpty()) {
                    current = sChars.pop();
                    if ((s.charAt(i) == ')' && current != '(') || (s.charAt(i) == ']' && current != '[') || (s.charAt(i) == '}' && current != '{')) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        if (!sChars.isEmpty()) {
            return false;
        }

        return true;
    }

    // using array of char as a stack
    // we prepare a map using an array of char
    // we're using close parentheses as an index because we want to pop the stack when close parentheses come
    // how about open parentheses? the map will return 0 as a default index
    private boolean isValid2(String s) {
        char[] sStacks = new char[s.length()];
        char[] sMap = new char[128];
        sMap[')'] = '(';
        sMap['}'] = '{';
        sMap[']'] = '[';
        int idx = 0;
        for (char c : s.toCharArray()) {
            if (sMap[c] == 0) {
                sStacks[idx++] = c;
            } else {
                // when stack is empty
                if (idx == 0) {
                    return false;
                }
                // simulate pop
                if (sStacks[idx-1] != sMap[c]) {
                    return false;
                }
                // always point to the top of the stack
                idx--;
            }
        }

        // just check if the pointer pointing to the bottom of the stack, empty stack
        return idx == 0;
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

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

    // push open to stack
    // find close bracket
    //// pop open stack if not empty, case ()
    //// pop star stack if not empty, case *)
    //// otherwise return false, case )
    // push star to stack
    // we need to make sure open stack if empty because * can be use as empty
    // until both open and star stack empty we need to check if the idx of open is before star, case (*, * is close bracket
    private boolean checkValidString(String s) {
        Stack<Integer> open = new Stack<>();
        Stack<Integer> star = new Stack<>();
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                open.push(i);
            } else if (s.charAt(i) == ')') {
                if (!open.isEmpty()) {
                    open.pop();
                } else if (!star.isEmpty()) {
                    star.pop();
                } else {
                    return false;
                }
            } else {
                star.push(i);
            }
        }

        while (!open.isEmpty() && !star.isEmpty()) {
            int idx = star.pop();
            if (open.peek() < idx) {
                open.pop();
            }
        }

        return open.isEmpty();
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.greedy;

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

    @Test
    void case04() {
        Assertions.assertTrue(checkValidString2("()"));
    }

    @Test
    void case05() {
        Assertions.assertTrue(checkValidString2("(*)"));
    }

    @Test
    void case06() {
        Assertions.assertTrue(checkValidString2("(*))"));
    }

    @Test
    void case07() {
        Assertions.assertFalse(checkValidString2("(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())"));
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

    // scan left to right to check if we have pair (* and ), * as (
    //// return true if all ( and * have paired with )
    // scan right to left to check if we have pair *) and (, * as )
    //// not all *) must be paired with ), * as empty
    // for each scan we must check if we have enough open/close bracket
    private boolean checkValidString2(String s) {
        int openCount = 0;
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '*') {
                openCount++;
            } else {
                openCount--;
            }
            if (openCount < 0) {
                return false;
            }
        }
        if (openCount == 0) {
            return true;
        }

        int closeCount = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == ')' || s.charAt(i) == '*') {
                closeCount++;
            } else {
                closeCount--;
            }
            if (closeCount < 0) {
                return false;
            }
        }
        return true;
    }
}

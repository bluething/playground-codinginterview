package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/check-if-a-parentheses-string-can-be-valid/
class CheckIfAParenthesesStringCanBeValidTest {

    @Test
    void case01() {
        Assertions.assertTrue(canBeValid("))()))", "010100"));
    }

    @Test
    void case02() {
        Assertions.assertTrue(canBeValid("()()", "0000"));
    }

    @Test
    void case03() {
        Assertions.assertFalse(canBeValid(")", "0"));
    }

    @Test
    void case04() {
        Assertions.assertFalse(canBeValid("))((", "0011"));
    }

    private boolean canBeValid(String s, String locked) {
        if (s.length() % 2 != 0) {
            return false;
        }
        int unlockedCount = 0;
        int openLockedCount = 0;
        int closeLockedCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (locked.charAt(i) == '0') {
                unlockedCount++;
            } else if (s.charAt(i) == '(') {
                openLockedCount++;
            } else if (s.charAt(i) == ')'){
                closeLockedCount++;
            }

            if (unlockedCount + openLockedCount - closeLockedCount < 0) {
                return false;
            }
        }

        unlockedCount = openLockedCount = closeLockedCount = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (locked.charAt(i) == '0') {
                unlockedCount++;
            } else if (s.charAt(i) == '(') {
                openLockedCount++;
            } else if (s.charAt(i) == ')'){
                closeLockedCount++;
            }

            if (unlockedCount - openLockedCount + closeLockedCount < 0) {
                return false;
            }
        }

        return true;
    }
}

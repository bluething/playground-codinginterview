package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {

    @Test
    public void case01() {
        Assertions.assertTrue(isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void case02() {
        Assertions.assertFalse(isPalindrome("race a car"));
    }

    @Test
    public void case03() {
        Assertions.assertTrue(isPalindrome(" "));
    }

    @Test
    public void case04() {
        Assertions.assertTrue(isPalindrome(".,"));
    }

    private boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();
        while (i < j) {
            while ((i < s.length() - 1) && !isAlphanumeric(s.charAt(i))) {
                i++;
            }
            while ((j > 0) && !isAlphanumeric(s.charAt(j))) {
                j--;
            }

            if ((i < j) && s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    private boolean isAlphanumeric(char c) {
        if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c >= 48 && c <= 57)) {
            return true;
        }

        return false;
    }
}

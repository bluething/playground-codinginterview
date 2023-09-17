package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partfour.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/valid-palindrome/description/
class ValidPalindromeTest {

    @Test
    void case01() {
        Assertions.assertTrue(isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void case02() {
        Assertions.assertFalse(isPalindrome("race a car"));
    }

    @Test
    void case03() {
        Assertions.assertTrue(isPalindrome(" "));
    }

    @Test
    void case04() {
        Assertions.assertTrue(isPalindrome(".,"));
    }

    @Test
    void case05() {
        Assertions.assertFalse(isPalindrome("0P"));
    }

    private boolean isPalindrome(String s) {
        char[] marks = new char[256];
        for (int i = 0; i < 10; i++) {
            marks[i + '0'] = (char) (i+1);
        }
        for (int i = 0; i < 26; i++) {
            marks[i + 'a'] = marks[i + 'A'] = (char) (i + 11);
        }

        int i = 0;
        int j = s.length()-1;
        char ci;
        char cj;
        while (i < j) {
            ci = marks[s.charAt(i)];
            cj = marks[s.charAt(j)];
            if (ci != 0 && cj != 0) {
                if (ci != cj) {
                    return false;
                }
                i++;
                j--;
            } else {
                if (ci == 0) {
                    i++;
                }
                if (cj == 0) {
                    j--;
                }
            }
        }
        return true;
    }
}

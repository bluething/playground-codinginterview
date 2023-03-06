package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/valid-palindrome-ii/
public class ValidPalindromeIITest {
    @Test
    public void case01() {
        Assertions.assertTrue(validPalindrome("aba"));
    }

    @Test
    public void case02() {
        Assertions.assertTrue(validPalindrome("abca"));
    }

    @Test
    public void case03() {
        Assertions.assertFalse(validPalindrome("abc"));
    }

    @Test
    public void case04() {
        Assertions.assertTrue(validPalindrome("deeee"));
    }

    @Test
    public void case05() {
        Assertions.assertFalse(validPalindrome("eeccccbebaeeabebccceea"));
    }
    private boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        s.toLowerCase();
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                if (isPalindrome(s, i, j-1)) {
                    return true;
                }
                return isPalindrome(s, i+1, j);
            }
            i++;
            j--;
        }
        return true;
    }

    private boolean isPalindrome (String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

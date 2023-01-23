package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// problem https://leetcode.com/problems/valid-palindrome-ii/description/
public class ValidPalindrome2Test {

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

    @Test
    public void case06() {
        Assertions.assertTrue(validPalindrome2("aba"));
    }

    @Test
    public void case07() {
        Assertions.assertTrue(validPalindrome2("abca"));
    }

    @Test
    public void case08() {
        Assertions.assertFalse(validPalindrome2("abc"));
    }

    @Test
    public void case09() {
        Assertions.assertTrue(validPalindrome2("deeee"));
    }

    @Test
    public void case10() {
        Assertions.assertFalse(validPalindrome2("eeccccbebaeeabebccceea"));
    }

    private boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                if (isPalindrome(s, i, j - 1)) {
                    return true;
                }
                return isPalindrome(s, i + 1, j);
            }
            i++;
            j--;
        }

        return true;
    }

    private boolean isPalindrome(String s, int i, int j) {
        s = s.toLowerCase();
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    private boolean validPalindrome2(String s) {
        return isPalindromeRecs(s, 0, s.length() - 1, 1);
    }

    private boolean isPalindromeRecs(String s, int i, int j, int removeQuota) {
        if (i >= j) {
            return true;
        }

        // if the char match, recursively check is palindrome for the next char both left and right
        if (s.charAt(i) == s.charAt(j)) {
            return isPalindromeRecs(s, i + 1, j - 1, removeQuota);
        }

        // we must stop if we don't have quota to remove the char
        if (removeQuota == 0) {
            return false;
        }

        // if the char in left and right doesn't match
        // check if the substring (eliminate either single char in left of right) is palindrome
        // don't forget to reduce the quota
        return isPalindromeRecs(s, i+1, j, removeQuota-1) || isPalindromeRecs(s, i, j-1, removeQuota-1);
    }
}

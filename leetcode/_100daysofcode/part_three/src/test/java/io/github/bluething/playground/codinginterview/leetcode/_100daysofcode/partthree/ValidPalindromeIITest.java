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

    private boolean validPalindrome2(String s) {
        return isPalindromeRec(s, 0, s.length()-1, 1);
    }

    private boolean isPalindromeRec (String s, int i, int j, int removeQuota) {
        if (i >= j) {
            return true;
        }
        // continue checking palindrome without reduce the quota
        if (s.charAt(i) == s.charAt(j)) {
            return isPalindromeRec(s, i+1, j-1, removeQuota);
        }
        // stop if we don't have any quota for deletion
        if (removeQuota == 0) {
            return false;
        }
        // continue checking palindrome with reduce the quota
        // must check the char after/before unequal char
        return isPalindromeRec(s, i+1, j, removeQuota-1) || isPalindromeRec(s, i, j-1, removeQuota-1);
    }
}

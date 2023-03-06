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

    @Test
    public void case11() {
        Assertions.assertTrue(validPalindrome3("aba"));
    }

    @Test
    public void case12() {
        Assertions.assertTrue(validPalindrome3("abca"));
    }

    @Test
    public void case13() {
        Assertions.assertFalse(validPalindrome3("abc"));
    }

    @Test
    public void case14() {
        Assertions.assertTrue(validPalindrome3("deeee"));
    }

    @Test
    public void case15() {
        Assertions.assertFalse(validPalindrome3("eeccccbebaeeabebccceea"));
    }

    @Test
    public void case16() {
        Assertions.assertTrue(validPalindrome4("aba"));
    }

    @Test
    public void case17() {
        Assertions.assertTrue(validPalindrome4("abca"));
    }

    @Test
    public void case18() {
        Assertions.assertFalse(validPalindrome4("abc"));
    }

    @Test
    public void case19() {
        Assertions.assertTrue(validPalindrome4("deeee"));
    }

    @Test
    public void case20() {
        Assertions.assertFalse(validPalindrome4("eeccccbebaeeabebccceea"));
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
        return isPalindromeRec(s, 0, s.length() - 1, 1);
    }

    private boolean isPalindromeRec(String s, int i, int j, int removeQuota) {
        if (i >= j) {
            return true;
        }
        // continue checking palindrome without reduce the quota
        if (s.charAt(i) == s.charAt(j)) {
            return isPalindromeRec(s, i + 1, j - 1, removeQuota);
        }
        // stop if we don't have any quota for deletion
        if (removeQuota == 0) {
            return false;
        }
        // continue checking palindrome with reduce the quota
        // must check the char after/before unequal char
        return isPalindromeRec(s, i + 1, j, removeQuota - 1) || isPalindromeRec(s, i, j - 1, removeQuota - 1);
    }

    private boolean validPalindrome3(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }

        return true;
    }

    private boolean validPalindrome4(String s) {
        // 1st difference idx
        // if palindrome (don't have diff indices), at the end of loop value of i will be >= j
        int[] indices1 = getDiffIndices(s, 0, s.length() - 1);
        if (indices1[0] >= indices1[1]) {
            return true;
        }
        // if we find 1st diff indices
        // need to check if the substring (removing right) have diff indices
        int[] indices2 = getDiffIndices(s, indices1[0], indices1[1] - 1);
        if (indices2[0] >= indices2[1]) {
            return true;
        }
        // if removing right side is palindrome
        // need to check if the substring (removing left) have diff indices
        int[] indices3 = getDiffIndices(s, indices1[0] + 1, indices1[1]);
        if (indices3[0] >= indices3[1]) {
            return true;
        }
        return false;
    }

    private int[] getDiffIndices(String s, int i, int j) {
        while ((i < j) && (s.charAt(i) == s.charAt(j))) {
            i++;
            j--;
        }
        return new int[]{i, j};
    }
}

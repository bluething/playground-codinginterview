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

        return false;
    }
}

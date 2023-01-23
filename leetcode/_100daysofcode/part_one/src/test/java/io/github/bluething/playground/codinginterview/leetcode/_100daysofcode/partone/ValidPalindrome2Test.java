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

    private boolean validPalindrome(String s) {
        return true;
    }
}

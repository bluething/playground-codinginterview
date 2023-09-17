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
        return true;
    }
}
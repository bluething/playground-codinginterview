package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/valid-palindrome/
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

    public boolean isPalindrome(String s) {

        return true;
    }
}

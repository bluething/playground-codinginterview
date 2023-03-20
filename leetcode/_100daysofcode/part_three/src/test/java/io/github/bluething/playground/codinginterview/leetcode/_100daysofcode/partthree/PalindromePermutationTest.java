package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://www.hackerearth.com/problem/algorithm/palindrome-check-2-1/
public class PalindromePermutationTest {
    @Test
    void case01() {
        Assertions.assertTrue(canPermutePalindrome("abba"));
    }

    @Test
    void case02() {
        Assertions.assertTrue(canPermutePalindrome("abc"));
    }

    private boolean canPermutePalindrome(String s) {
        return false;
    }
}

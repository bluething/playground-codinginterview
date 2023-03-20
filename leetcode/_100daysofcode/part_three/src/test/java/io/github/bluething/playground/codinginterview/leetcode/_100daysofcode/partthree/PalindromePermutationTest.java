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
        Assertions.assertFalse(canPermutePalindrome("abc"));
    }

    // the palindrome happen when there are max 1 unique char
    // can be 0 if the length of the string even
    private boolean canPermutePalindrome(String s) {
        int[] freqChar = new int[128];
        for (int i = 0; i < s.length(); i++) {
            freqChar[s.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < freqChar.length; i++) {
            count += freqChar[i] %2;
        }

        return count <= 1;
    }
}

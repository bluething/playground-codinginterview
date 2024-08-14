package io.github.bluething.playground.codinginterview.hackerrank._1weekpreparationkit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeIndexTest {
    @Test
    void case01() {
        Assertions.assertEquals(3, palindromeIndex("aaab"));
    }
    @Test
    void case02() {
        Assertions.assertEquals(0, palindromeIndex("baa"));
    }
    @Test
    void case03() {
        Assertions.assertEquals(-1, palindromeIndex("aaa"));
    }
    private int palindromeIndex(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right && chars[left] == chars[right]) {
            left++;
            right--;
        }
        if (left >= right) {
            return -1;
        }
        if (isPalindrome(s, left+1, right)) {
            return left;
        }
        if (isPalindrome(s, left, right-1)) {
            return right;
        }

        return -1;
    }
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right && s.charAt(left) == s.charAt(right)) {
            left++;
            right--;
        }

        return left >= right;
    }
}

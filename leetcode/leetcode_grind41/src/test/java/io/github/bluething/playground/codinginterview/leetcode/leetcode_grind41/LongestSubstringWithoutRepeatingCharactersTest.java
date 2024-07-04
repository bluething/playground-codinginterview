package io.github.bluething.playground.codinginterview.leetcode.leetcode_grind41;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    void case01() {
        Assertions.assertEquals(3, lengthOfLongestSubstring("abcabcbb"));
    }
    @Test
    void case02() {
        Assertions.assertEquals(1, lengthOfLongestSubstring("bbbbb"));
    }
    @Test
    void case03() {
        Assertions.assertEquals(3, lengthOfLongestSubstring("pwwkew"));
    }
    private int lengthOfLongestSubstring(String s) {
        return 0;
    }
}

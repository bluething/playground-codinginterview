package io.github.bluething.playground.codinginterview.leetcode.slidingwindow101;

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

    @Test
    void case04() {
        Assertions.assertEquals(0, lengthOfLongestSubstring(""));
    }

    @Test
    void case05() {
        Assertions.assertEquals(4, lengthOfLongestSubstring("dabcabcbb"));
    }

    @Test
    void case06() {
        Assertions.assertEquals(3, lengthOfLongestSubstring("abccabcbb"));
    }

    private int lengthOfLongestSubstring(String s) {
        return 0;
    }
}

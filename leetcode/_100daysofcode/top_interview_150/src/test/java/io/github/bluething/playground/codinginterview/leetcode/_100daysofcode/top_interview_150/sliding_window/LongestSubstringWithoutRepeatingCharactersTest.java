package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.sliding_window;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/?envType=study-plan-v2&envId=top-interview-150
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
        int maxLength = 0;

        return maxLength;
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.sliding_window;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/description/
// https://www.lintcode.com/problem/386/
class LongestSubstringWithAtMostKDistinctCharactersTest {

    @Test
    void case01() {
        Assertions.assertEquals(4, lengthOfLongestSubstringKDistinct("eceba", 3));
    }

    @Test
    void case02() {
        Assertions.assertEquals(4, lengthOfLongestSubstringKDistinct("WORLD", 4));
    }

    @Test
    void case03() {
        Assertions.assertEquals(7, lengthOfLongestSubstringKDistinct("abbbbbbc", 2));
    }

    private int lengthOfLongestSubstringKDistinct(String s, int k) {
        int longest = 0;
        return longest;
    }
}

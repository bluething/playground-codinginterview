package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.sliding_window;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters/description/
// https://aaronice.gitbook.io/lintcode/two_pointers/longest-substring-with-at-most-two-distinct-characters
class LongestSubstringWithAtMostTwoDistinctCharactersTest {

    @Test
    void case01() {
        Assertions.assertEquals(3, lengthOfLongestSubstringTwoDistinct("eceba"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(5, lengthOfLongestSubstringTwoDistinct("ccaabbb"));
    }

    private int lengthOfLongestSubstringTwoDistinct(String s) {
        int longest = 0;

        return longest;
    }
}

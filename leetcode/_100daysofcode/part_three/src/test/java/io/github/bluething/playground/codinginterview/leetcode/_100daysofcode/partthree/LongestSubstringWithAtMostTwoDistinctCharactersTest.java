package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        return 0;
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
class SubstringsOfSizeThreeWithDistinctCharactersTest {

    @Test
    void case01() {
        Assertions.assertEquals(1, countGoodSubstrings("xyzzaz"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(4, countGoodSubstrings("aababcabc"));
    }

    private int countGoodSubstrings(String s) {
        return 0;
    }
}

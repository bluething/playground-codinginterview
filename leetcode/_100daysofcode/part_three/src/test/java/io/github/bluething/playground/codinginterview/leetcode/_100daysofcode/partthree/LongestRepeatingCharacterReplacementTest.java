package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/longest-repeating-character-replacement/
class LongestRepeatingCharacterReplacementTest {
    @Test
    void case01() {
        Assertions.assertEquals(4, characterReplacement("ABAB", 2));
    }

    @Test
    void case02() {
        Assertions.assertEquals(4, characterReplacement("AABABBA", 1));
    }

    private int characterReplacement(String s, int k) {
        return 0;
    }
}

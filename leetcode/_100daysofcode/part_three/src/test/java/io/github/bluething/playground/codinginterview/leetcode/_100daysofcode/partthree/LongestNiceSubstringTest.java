package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/longest-nice-substring/
class LongestNiceSubstringTest {

    @Test
    void case01() {
        Assertions.assertEquals("aAa", longestNiceSubstring("YazaAay"));
    }

    @Test
    void case02() {
        Assertions.assertEquals("Bb", longestNiceSubstring("Bb"));
    }

    @Test
    void case03() {
        Assertions.assertEquals("", longestNiceSubstring("C"));
    }

    private String longestNiceSubstring(String s) {
        return "";
    }
}

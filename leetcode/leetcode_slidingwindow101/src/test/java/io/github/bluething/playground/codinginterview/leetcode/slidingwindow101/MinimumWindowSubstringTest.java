package io.github.bluething.playground.codinginterview.leetcode.slidingwindow101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumWindowSubstringTest {
    @Test
    void case01() {
        Assertions.assertEquals("BANC", minWindow("ADOBECODEBANC", "ABC"));
    }
    @Test
    void case02() {
        Assertions.assertEquals("a", minWindow("a", "a"));
    }
    @Test
    void case03() {
        Assertions.assertEquals("", minWindow("a", "aa"));
    }
    private String minWindow(String s, String t) {
        return "";
    }
}
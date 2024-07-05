package io.github.bluething.playground.codinginterview.leetcode.hashtable101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IsomorphicStringsTest {
    @Test
    void case01() {
        Assertions.assertTrue(isIsomorphic("egg", "add"));
    }
    @Test
    void case02() {
        Assertions.assertFalse(isIsomorphic("foo", "bar"));
    }
    @Test
    void case03() {
        Assertions.assertTrue(isIsomorphic("paper", "title"));
    }

    private boolean isIsomorphic(String s, String t) {
        return false;
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/isomorphic-strings/?envType=study-plan-v2&id=top-interview-150
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

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partfour.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/merge-strings-alternately/
class MergeStringsAlternatelyTest {

    @Test
    void case01() {
        Assertions.assertEquals("apbqcr", mergeAlternately("abc", "pqr"));
    }
    @Test
    void case02() {
        Assertions.assertEquals("apbqrs", mergeAlternately("ab", "pqrs"));
    }
    @Test
    void case03() {
        Assertions.assertEquals("apbqcd", mergeAlternately("abcd", "pq"));
    }

    private String mergeAlternately(String word1, String word2) {
        return "";
    }
}

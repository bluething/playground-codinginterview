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
        int i = 0;
        int j = 0;
        StringBuilder result = new StringBuilder();
        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(j));
            i++;
            j++;
        }
        if (i < word1.length()) {
            result.append(word1.substring(i));
        }
        if (j < word2.length()) {
            result.append(word2.substring(j));
        }

        return result.toString();
    }
}

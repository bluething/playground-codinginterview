package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/palindrome-partitioning/
class PalindromePartitioningTest {

    @Test
    void case01() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList("a","a","b"),
                Arrays.asList("aa","b")), partition("aab"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList("a")), partition("a"));
    }

    private List<List<String>> partition(String s) {
        return null;
    }
}

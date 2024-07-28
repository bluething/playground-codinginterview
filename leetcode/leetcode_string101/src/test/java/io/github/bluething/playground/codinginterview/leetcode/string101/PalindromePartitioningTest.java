package io.github.bluething.playground.codinginterview.leetcode.string101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class PalindromePartitioningTest {
    @Test
    void case01() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList("a","a","b"),
                Arrays.asList("aa","b")), partition("aab"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(List.of(List.of("a")), partition("a"));
    }

    private List<List<String>> partition(String s) {
        return Collections.emptyList();
    }
}

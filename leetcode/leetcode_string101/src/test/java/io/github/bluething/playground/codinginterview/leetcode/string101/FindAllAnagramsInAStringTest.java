package io.github.bluething.playground.codinginterview.leetcode.string101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

class FindAllAnagramsInAStringTest {
    @Test
    void case01() {
        Assertions.assertEquals(List.of(0,6), findAnagrams("cbaebabacd", "abc"));
    }
    @Test
    void case02() {
        Assertions.assertEquals(List.of(0,1,2), findAnagrams("abab", "ab"));
    }

    private List<Integer> findAnagrams(String s, String p) {
        return Collections.emptyList();
    }
}

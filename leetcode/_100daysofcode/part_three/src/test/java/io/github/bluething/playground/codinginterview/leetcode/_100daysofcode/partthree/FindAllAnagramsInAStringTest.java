package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

// https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
class FindAllAnagramsInAStringTest {

    @Test
    void case01() {
        Assertions.assertEquals(List.of(0, 2), findAnagrams("cbaebabacd", "abc"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(List.of(0, 1, 2), findAnagrams("abab", "ab"));
    }

    private List<Integer> findAnagrams(String s, String p) {
        return null;
    }
}

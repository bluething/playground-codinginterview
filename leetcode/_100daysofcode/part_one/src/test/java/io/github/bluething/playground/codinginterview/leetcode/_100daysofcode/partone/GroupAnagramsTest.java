package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GroupAnagramsTest {

    @Test
    public void case01() {
        List<List<String>> expected = Arrays.asList(Arrays.asList("bat"),
                Arrays.asList("nat","tan"),
                Arrays.asList("ate","eat","tea"));
        Assertions.assertEquals(expected, groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    @Test
    public void case02() {
        List<List<String>> expected = Arrays.asList(Arrays.asList(""));
        Assertions.assertEquals(expected, groupAnagrams(new String[]{""}));
    }

    @Test
    public void case03() {
        List<List<String>> expected = Arrays.asList(Arrays.asList("a"));
        Assertions.assertEquals(expected, groupAnagrams(new String[]{"a"}));
    }

    private List<List<String>> groupAnagrams(String[] strs) {
        return Collections.emptyList();
    }
}

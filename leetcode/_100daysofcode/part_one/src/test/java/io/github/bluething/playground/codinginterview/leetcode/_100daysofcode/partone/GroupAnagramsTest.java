package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class GroupAnagramsTest {

    @Test
    public void case01() {
        List<List<String>> expected = Arrays.asList(Arrays.asList("eat","tea","ate"),
                Arrays.asList("bat"),
                Arrays.asList("tan", "nat"));
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
        Map<String, List<String>> anagrams = new HashMap<>();
        char[] cStr = null;
        String sortStr = "";
        for (String str : strs) {
            cStr = str.toCharArray();
            Arrays.sort(cStr);
            sortStr = new String(cStr);
            if (anagrams.containsKey(sortStr)) {
                anagrams.get(sortStr).add(str);
            } else {
                anagrams.put(sortStr, new ArrayList<>(Arrays.asList(str)));
            }

        }

        return new ArrayList<>(anagrams.values());
    }
}
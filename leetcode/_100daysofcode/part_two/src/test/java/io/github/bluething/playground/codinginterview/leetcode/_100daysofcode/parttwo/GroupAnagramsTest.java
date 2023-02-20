package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.parttwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

// https://leetcode.com/problems/group-anagrams/
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
        char[] charStr;
        String sortedStr;
        for (String str : strs) {
            charStr = str.toCharArray();
            Arrays.sort(charStr);
            sortedStr = String.valueOf(charStr);
            if (anagrams.get(sortedStr) == null) {
                anagrams.put(sortedStr, new ArrayList<>(Arrays.asList(str)));
            } else {
                anagrams.get(sortedStr).add(str);
            }
        }

        return new ArrayList<>(anagrams.values());
    }
}

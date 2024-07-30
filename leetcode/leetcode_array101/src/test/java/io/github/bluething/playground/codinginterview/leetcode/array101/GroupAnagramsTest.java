package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class GroupAnagramsTest {
    @Test
    void case01() {
        List<List<String>> expected = Arrays.asList(Arrays.asList("eat","tea","ate"),
                Arrays.asList("bat"),
                Arrays.asList("tan", "nat"));
        Assertions.assertEquals(expected, groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    @Test
    void case02() {
        List<List<String>> expected = Arrays.asList(Arrays.asList(""));
        Assertions.assertEquals(expected, groupAnagrams(new String[]{""}));
    }

    @Test
    void case03() {
        List<List<String>> expected = Arrays.asList(Arrays.asList("a"));
        Assertions.assertEquals(expected, groupAnagrams(new String[]{"a"}));
    }
    @Test
    void case04() {
        List<List<String>> expected = Arrays.asList(Arrays.asList("eat","tea","ate"),
                Arrays.asList("bat"),
                Arrays.asList("tan", "nat"));
        Assertions.assertEquals(expected, groupAnagrams2(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    @Test
    void case05() {
        List<List<String>> expected = Arrays.asList(Arrays.asList(""));
        Assertions.assertEquals(expected, groupAnagrams2(new String[]{""}));
    }

    @Test
    void case06() {
        List<List<String>> expected = Arrays.asList(Arrays.asList("a"));
        Assertions.assertEquals(expected, groupAnagrams2(new String[]{"a"}));
    }

    private List<List<String>> groupAnagrams(String[] strs) {
        int[] freqChar = new int[26];
        String freqS = "";
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String str : strs) {
            freqChar = new int[26];
            for (char c : str.toCharArray()) {
                freqChar[c - 'a']++;
            }
            freqS = Arrays.toString(freqChar);

            anagrams.computeIfAbsent(freqS, k -> new ArrayList<>());

            anagrams.get(freqS).add(str);
        }

        return new ArrayList<>(anagrams.values());
    }

    private List<List<String>> groupAnagrams2(String[] strs) {
        char[] freqChar = new char[26];
        String freqS = "";
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String str : strs) {
            freqChar = new char[26];
            for (char c : str.toCharArray()) {
                freqChar[c - 'a']++;
            }
            freqS = Arrays.toString(freqChar);

            if (anagrams.get(freqS) == null) {
                anagrams.put(freqS, new ArrayList<>());
            }

            anagrams.get(freqS).add(str);
        }

        return new ArrayList<>(anagrams.values());
    }
}

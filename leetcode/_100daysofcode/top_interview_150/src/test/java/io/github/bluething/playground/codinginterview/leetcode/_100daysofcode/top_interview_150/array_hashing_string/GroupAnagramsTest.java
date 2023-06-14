package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

// https://leetcode.com/problems/group-anagrams/?envType=study-plan-v2&envId=top-interview-150
public class GroupAnagramsTest {

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

    // time complexity O(NKlogK)
    private List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        char[] sChars = null;
        String strSorted = "";
        for (String str : strs) {
            sChars = str.toCharArray();
            Arrays.sort(sChars);
            strSorted = String.valueOf(sChars);
            if (anagrams.get(strSorted) == null) {
                anagrams.put(strSorted, new ArrayList<>(){{
                    add(str);
                }});
            } else {
                anagrams.get(strSorted).add(str);
            }
        }

        return new ArrayList<>(anagrams.values());
    }

    // if we don't care about the output, we can use this approach with better time complexity O(M*N)
    // the difference with above solution is how we determine if the strings is an anagram
    // in this approach we're using a frequency
    // two string was an anagram if the frequency for the same char is same
    private List<List<String>> groupAnagrams2(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        char[] freq = new char[]{};
        String freqS = "";
        for (String str : strs) {
            freq = new char[26];
            for (char c : str.toCharArray()) {
                freq[c - 'a']++;
            }
            freqS = String.valueOf(freq);
            if (!anagrams.containsKey(freqS)) {
                anagrams.put(freqS, new ArrayList<>());
            }
            anagrams.get(freqS).add(str);
        }

        return new ArrayList<>(anagrams.values());
    }
}

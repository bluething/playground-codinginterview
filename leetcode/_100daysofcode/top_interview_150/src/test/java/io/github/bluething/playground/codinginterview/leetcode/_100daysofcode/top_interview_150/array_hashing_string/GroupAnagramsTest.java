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
}

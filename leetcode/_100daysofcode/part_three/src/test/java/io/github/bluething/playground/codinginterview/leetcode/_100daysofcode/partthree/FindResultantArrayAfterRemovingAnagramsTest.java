package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/
public class FindResultantArrayAfterRemovingAnagramsTest {
    @Test
    public void case01() {
        List<String> expected = Arrays.asList("abba","cd");
        Assertions.assertEquals(expected, removeAnagrams(new String[]{"abba","baba","bbaa","cd","cd"}));
    }

    @Test
    public void case02() {
        List<String> expected = Arrays.asList("a","b","c","d","e");
        Assertions.assertEquals(expected, removeAnagrams(new String[]{"a","b","c","d","e"}));
    }

    private List<String> removeAnagrams(String[] words) {
        List<String> results = new ArrayList<>();

        return results;
    }
}

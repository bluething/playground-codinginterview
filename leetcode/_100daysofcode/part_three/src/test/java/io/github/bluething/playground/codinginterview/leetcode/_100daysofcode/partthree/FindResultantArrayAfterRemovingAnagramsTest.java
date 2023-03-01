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
        for (int i = 0; i < words.length;) {
            int nextIdx = i+1;
            while (nextIdx < words.length && isAnagram(words[i], words[nextIdx])) {
                nextIdx++;
            }
            results.add(words[i]);
            i = nextIdx;
        }

        return results;
    }

    private boolean isAnagram(String s1, String s2) {
        int[] marks = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            marks[s1.charAt(i)-97]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (--marks[s2.charAt(i)-97] < 0) {
                return false;
            }
        }
        return true;
    }
}

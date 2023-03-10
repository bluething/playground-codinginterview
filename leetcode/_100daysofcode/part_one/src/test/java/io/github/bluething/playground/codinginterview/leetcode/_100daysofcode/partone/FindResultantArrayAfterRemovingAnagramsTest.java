package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        List<String> anagrams = new ArrayList<>();
        for (int idx = 0; idx < words.length;) {
            int nextIdx = idx+1;
            while (nextIdx < words.length && isAnagram(words[idx], words[nextIdx])){
                nextIdx++;
            }
            anagrams.add(words[idx]);
            idx = nextIdx;
        }

        return anagrams;
    }

    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] freqs = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freqs[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (--freqs[t.charAt(i) - 97] < 0) {
                return false;
            }
        }

        return true;
    }
}

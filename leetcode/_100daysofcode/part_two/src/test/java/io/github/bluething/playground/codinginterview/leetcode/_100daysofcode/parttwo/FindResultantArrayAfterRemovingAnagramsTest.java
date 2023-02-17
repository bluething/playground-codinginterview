package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.parttwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindResultantArrayAfterRemovingAnagramsTest {

    @Test
    void case01() {
        List<String> expected = Arrays.asList("abba","cd");
        Assertions.assertEquals(expected, removeAnagrams(new String[]{"abba","baba","bbaa","cd","cd"}));
    }

    @Test
    void case02() {
        List<String> expected = Arrays.asList("a","b","c","d","e");
        Assertions.assertEquals(expected, removeAnagrams(new String[]{"a","b","c","d","e"}));
    }

    private List<String> removeAnagrams(String[] words) {
        List<String> results = new ArrayList<>();
        results.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (isAnagram(words[i-1], words[i])) {
                continue;
            }
            results.add(words[i]);
        }

        return results;
    }

    private boolean isAnagram(String s1, String s2) {
        int[] alphabetIdx = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            alphabetIdx[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            alphabetIdx[s2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < alphabetIdx.length; i++) {
            if (alphabetIdx[i] != 0) {
                return false;
            }
        }

        return true;
    }
}

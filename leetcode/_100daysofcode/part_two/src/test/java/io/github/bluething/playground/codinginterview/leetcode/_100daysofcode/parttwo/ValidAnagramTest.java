package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.parttwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidAnagramTest {
    @Test
    void case01() {
        Assertions.assertTrue(isAnagram("anagram", "nagaram"));
    }

    @Test
    void case02() {
        Assertions.assertFalse(isAnagram("rat", "car"));
    }

    @Test
    void case03() {
        Assertions.assertFalse(isAnagram("zlap", "kcqx"));
    }

    @Test
    void case04() {
        Assertions.assertFalse(isAnagram("ab", "b"));
    }

    private boolean isAnagram(String s, String t) {
        int[] alphabetIdx = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabetIdx[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            alphabetIdx[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < alphabetIdx.length; i++) {
            if (alphabetIdx[i] != 0) {
                return false;
            }
        }
        return true;
    }
}

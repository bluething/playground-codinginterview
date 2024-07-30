package io.github.bluething.playground.codinginterview.leetcode.string101;

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

    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] frequency = new int[26];
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
            frequency[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (frequency[i] != 0) {
                return false;
            }
        }
        return true;
    }
}

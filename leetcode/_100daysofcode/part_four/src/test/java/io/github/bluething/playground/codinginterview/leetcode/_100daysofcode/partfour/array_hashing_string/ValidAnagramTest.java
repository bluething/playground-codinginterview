package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partfour.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/valid-anagram/
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
        Assertions.assertFalse(isAnagram("a", "ab"));
    }

    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] marks = new char[26];
        for (int i = 0; i < s.length(); i++) {
            marks[s.charAt(i)-97]++;
            marks[t.charAt(i)-97]--;
        }

        for (char mark : marks) {
            if (mark != 0) {
                return false;
            }
        }

        return true;
    }
}

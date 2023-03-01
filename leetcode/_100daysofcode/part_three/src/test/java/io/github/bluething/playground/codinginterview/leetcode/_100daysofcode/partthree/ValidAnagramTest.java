package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/valid-anagram/
public class ValidAnagramTest {
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
        int[] marks = new int[26];
        for (int i = 0; i < s.length(); i++) {
            marks[s.charAt(i)-97]++;
        }
        for (int i = 0; i < t.length(); i++) {
            marks[t.charAt(i)-97]--;
        }
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] != 0) {
                return false;
            }
        }

        return true;
    }
}

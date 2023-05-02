package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.arrays_hashing;

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

    @Test
    public void case04() {
        Assertions.assertTrue(isAnagram2("anagram", "nagaram"));
    }

    @Test
    public void case05() {
        Assertions.assertFalse(isAnagram2("rat", "car"));
    }

    @Test
    void case06() {
        Assertions.assertFalse(isAnagram2("a", "ab"));
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

    private boolean isAnagram2(String s, String t) {
        int[] marks = new int[26];
        for (int i = 0; i < s.length(); i++) {
            marks[s.charAt(i)-97]++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (--marks[t.charAt(i)-97] < 0) {
                return false;
            }
        }
        return true;
    }
}

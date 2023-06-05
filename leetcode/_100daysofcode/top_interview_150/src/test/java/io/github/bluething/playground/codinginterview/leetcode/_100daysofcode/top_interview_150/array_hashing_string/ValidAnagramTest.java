package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/valid-anagram/?envType=study-plan-v2&envId=top-interview-150
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

    @Test
    void case04() {
        Assertions.assertTrue(isAnagram2("anagram", "nagaram"));
    }

    @Test
    void case05() {
        Assertions.assertFalse(isAnagram2("rat", "car"));
    }

    @Test
    void case06() {
        Assertions.assertFalse(isAnagram2("a", "ab"));
    }

    private boolean isAnagram(String s, String t) {
        char[] marks = new char[26];
        for (char sChar : s.toCharArray()) {
            marks[sChar - 97]++;
        }
        for (char tChar : t.toCharArray()) {
            marks[tChar - 97]--;
        }
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] != 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] marks = new char[26];
        for (int i = 0; i < s.length(); i++) {
            marks[s.charAt(i) - 97]++;
            marks[t.charAt(i) - 97]--;
        }
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] != 0) {
                return false;
            }
        }
        return true;
    }
}

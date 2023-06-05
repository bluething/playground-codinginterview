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
}

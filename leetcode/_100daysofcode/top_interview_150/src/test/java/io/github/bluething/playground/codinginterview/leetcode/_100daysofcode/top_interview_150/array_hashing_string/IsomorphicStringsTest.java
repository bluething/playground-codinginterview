package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/isomorphic-strings/?envType=study-plan-v2&id=top-interview-150
class IsomorphicStringsTest {

    @Test
    void case01() {
        Assertions.assertTrue(isIsomorphic("egg", "add"));
    }

    @Test
    void case02() {
        Assertions.assertFalse(isIsomorphic("foo", "bar"));
    }

    @Test
    void case03() {
        Assertions.assertTrue(isIsomorphic("paper", "title"));
    }

    @Test
    void case04() {
        Assertions.assertFalse(isIsomorphic("badc", "baba"));
    }

    @Test
    void case05() {
        Assertions.assertFalse(isIsomorphic("bbbaaaba", "aaabbbba"));
    }

    @Test
    void case06() {
        Assertions.assertTrue(isIsomorphic("bbbaaa", "aaabbb"));
    }

    // the idea is to store the last seen positions of current (i-th) characters in both strings
    // "foo" and "bar"
    // after 2nd loop:
    // 1st "o" in "foo" we will have freqS[102]=2
    // "a" in "bar" we will have freqT[97]=2
    // we can say that "o" mapped to "a"
    // in 3rd loop:
    // 2nd "o" in "foo" we will have freqS[102]=2, but
    // "r" in "bar" we will have freqT[114]=0
    private boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] freqS = new int[256];
        int[] freqT = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (freqS[s.charAt(i)] != freqT[t.charAt(i)]) {
                return false;
            }

            freqS[s.charAt(i)] = i + 1;
            freqT[t.charAt(i)] = i + 1;
        }
        return true;
    }
}

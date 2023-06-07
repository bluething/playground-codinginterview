package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&id=top-interview-150
class IsSubsequenceTest {

    @Test
    void case01() {
        Assertions.assertTrue(isSubsequence("abc", "ahbgdc"));
    }
    @Test
    void case02() {
        Assertions.assertFalse(isSubsequence("axc", "ahbgdc"));
    }
    @Test
    void case03() {
        Assertions.assertFalse(isSubsequence("aaaaaa", "bbaaaa"));
    }


    // using two pointers for s and t
    // we loop as long as both pointer not reach the end of string
    // pointer s will increase when pointer t have same value
    // if s is subsequence of t then at the end pointer s must reach end of string
    private boolean isSubsequence(String s, String t) {
        int i = 0;
        for (int j = 0; j < t.length() && i < s.length(); j++) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }
        return i == s.length();
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partfour.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=top-interview-150
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

    private boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

}

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
        Assertions.assertTrue(isSubsequence("axc", "ahbgdc"));
    }


    private boolean isSubsequence(String s, String t) {
        return false;
    }
}

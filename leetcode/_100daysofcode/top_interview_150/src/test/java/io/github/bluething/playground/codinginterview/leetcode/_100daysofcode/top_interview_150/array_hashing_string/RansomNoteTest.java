package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/ransom-note/?envType=study-plan-v2&id=top-interview-150
class RansomNoteTest {

    @Test
    void case01() {
        Assertions.assertFalse(canConstruct("a", "b"));
    }

    @Test
    void case02() {
        Assertions.assertFalse(canConstruct("aa", "ab"));
    }

    @Test
    void case03() {
        Assertions.assertTrue(canConstruct("aa", "aab"));
    }

    private boolean canConstruct(String ransomNote, String magazine) {
        return false;
    }
}

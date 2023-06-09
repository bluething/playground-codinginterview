package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/word-pattern/description/?envType=study-plan-v2&id=top-interview-150
class WordPatternTest {

    @Test
    void case01() {
        Assertions.assertTrue(wordPattern("abba", "dog cat cat dog"));
    }

    @Test
    void case02() {
        Assertions.assertFalse(wordPattern("abba", "dog cat cat fish"));
    }

    @Test
    void case03() {
        Assertions.assertFalse(wordPattern("aaaa", "dog cat cat dog"));
    }

    private boolean wordPattern(String pattern, String s) {
        return true;
    }
}

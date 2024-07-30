package io.github.bluething.playground.codinginterview.leetcode.string101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidAnagramTest {
    @Test
    void case01() {
        Assertions.assertTrue(isAnagram("anagram", "nagaram"));
    }
    @Test
    void case02() {
        Assertions.assertFalse(isAnagram("rat", "car"));
    }

    private boolean isAnagram(String s, String t) {
        return true;
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

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

    private boolean isAnagram(String s, String t) {

        return true;
    }
}

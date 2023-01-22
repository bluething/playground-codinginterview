package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidAnagramTest {

    @Test
    public void case01() {
        Assertions.assertTrue(isAnagram("anagram", "nagaram"));
    }

    @Test
    public void case02() {
        Assertions.assertFalse(isAnagram("rat", "car"));
    }

    private boolean isAnagram(String s, String t) {
        return false;
    }
}

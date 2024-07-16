package io.github.bluething.playground.codinginterview.leetcode.slidingwindow101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PermutationinStringTest {
    @Test
    void case01() {
        Assertions.assertTrue(checkInclusion("ab", "eidbaooo"));
    }
    @Test
    void case02() {
        Assertions.assertFalse(checkInclusion("ab", "eidboaoo"));
    }
    private boolean checkInclusion(String s1, String s2) {
        return true;
    }
}

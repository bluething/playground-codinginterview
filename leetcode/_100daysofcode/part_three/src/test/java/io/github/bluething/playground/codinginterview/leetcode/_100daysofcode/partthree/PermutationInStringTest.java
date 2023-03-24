package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/permutation-in-string/
class PermutationInStringTest {

    @Test
    void case01() {
        Assertions.assertTrue(checkInclusion("ab", "eidbaooo"));
    }

    void case02() {
        Assertions.assertFalse(checkInclusion("ab", "eidboaoo"));
    }

    private boolean checkInclusion(String s1, String s2) {
        return true;
    }
}
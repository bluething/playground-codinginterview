package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partfour.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/contains-duplicate-ii/?envType=study-plan-v2&id=top-interview-150
class ContainsDuplicateIITest {

    @Test
    void case01() {
        Assertions.assertTrue(containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
    }

    @Test
    void case02() {
        Assertions.assertTrue(containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
    }

    @Test
    void case03() {
        Assertions.assertFalse(containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }

    @Test
    void case04() {
        Assertions.assertFalse(containsNearbyDuplicate(new int[]{1,2,1}, 0));
    }

    private boolean containsNearbyDuplicate(int[] nums, int k) {
        return false;
    }
}

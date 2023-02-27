package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate-ii/
public class ContainsDuplicate2Test {
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

    private boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> slidingWindows = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!slidingWindows.add(nums[i])) {
                return true;
            }
            // we only want to keep slidingWindows size at |i-k|
            // so we delete leftmost value before we insert new value
            if (i >= k) {
                slidingWindows.remove(nums[i-k]);
            }
            slidingWindows.add(nums[i]);

        }
        return false;
    }
}

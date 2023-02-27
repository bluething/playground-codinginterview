package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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

    @Test
    public void case04() {
        Assertions.assertTrue(containsNearbyDuplicate2(new int[]{1,2,3,1}, 3));
    }

    @Test
    public void case05() {
        Assertions.assertTrue(containsNearbyDuplicate2(new int[]{1,0,1,1}, 1));
    }

    @Test
    public void case06() {
        Assertions.assertFalse(containsNearbyDuplicate2(new int[]{1,2,3,1,2,3}, 2));
    }

    @Test
    public void case07() {
        Assertions.assertFalse(containsNearbyDuplicate2(new int[]{1,2,1}, 0));
    }

    @Test
    public void case08() {
        Assertions.assertFalse(containsNearbyDuplicate(new int[]{1,2,1}, 0));
    }

    private boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) {
            return false;
        }

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

    private boolean containsNearbyDuplicate2(int[] nums, int k) {
        if (k == 0) {
            return false;
        }

        Map<Integer, Integer> numsCounter = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsCounter.get(nums[i]) != null) {
                return true;
            }
            if (i >= k) {
                numsCounter.remove(nums[i-k]);
            }
            numsCounter.put(nums[i], i);
        }
        return false;
    }
}

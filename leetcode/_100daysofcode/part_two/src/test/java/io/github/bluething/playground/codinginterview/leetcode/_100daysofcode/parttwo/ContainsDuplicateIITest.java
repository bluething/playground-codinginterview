package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.parttwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate-ii/description/
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
        Assertions.assertTrue(containsNearbyDuplicate2(new int[]{1,2,3,1}, 3));
    }

    @Test
    void case05() {
        Assertions.assertTrue(containsNearbyDuplicate2(new int[]{1,0,1,1}, 1));
    }

    @Test
    void case06() {
        Assertions.assertFalse(containsNearbyDuplicate2(new int[]{1,2,3,1,2,3}, 2));
    }

    @Test
    void case07() {
        Assertions.assertTrue(containsNearbyDuplicate2(new int[]{99,99}, 2));
    }

    private boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) {
            return false;
        }

        Set<Integer> slidingWindow = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (slidingWindow.contains(nums[i])) {
                return true;
            }
            // maintain the window width
            if (i >= k) {
                slidingWindow.remove(nums[i-k]);
            }
            slidingWindow.add(nums[i]);
        }

        return false;
    }

    private boolean containsNearbyDuplicate2(int[] nums, int k) {
        if (k == 0) {
            return false;
        }

        Map<Integer, Integer> valIdx = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (valIdx.containsKey(nums[i]) && i - valIdx.get(nums[i]) <= k) {
                return true;
            }
            valIdx.put(nums[i], i);
        }

        return false;
    }
}

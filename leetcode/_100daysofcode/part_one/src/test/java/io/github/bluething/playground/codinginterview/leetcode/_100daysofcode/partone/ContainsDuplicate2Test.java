package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// problem https://leetcode.com/problems/contains-duplicate-ii/
public class ContainsDuplicate2Test {

    @Test
    public void case01() {
        Assertions.assertTrue(containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
    }

    @Test
    public void case02() {
        Assertions.assertTrue(containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
    }

    @Test
    public void case03() {
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

    private boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean isDuplicate = false;
        Map<Integer, Integer> valIdx = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // duplicate if the map contains the value (as index)
            // and the map value difference with the current index <= k
            if (valIdx.containsKey(nums[i]) && i - valIdx.get(nums[i]) <= k) {
                isDuplicate = true;
                break;
            }
            valIdx.put(nums[i], i);
        }

        return isDuplicate;
    }

    private boolean containsNearbyDuplicate2(int[] nums, int k) {
        boolean isDuplicate = false;
        Set<Integer> windows = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (windows.contains(nums[i])) {
                isDuplicate = true;
                break;
            }
            if (i >= k) {
                // remove leftmost index value in windows to keep the window size <= k
                windows.remove(nums[i - k]);
            }
            windows.add(nums[i]);
        }

        return isDuplicate;
    }
}

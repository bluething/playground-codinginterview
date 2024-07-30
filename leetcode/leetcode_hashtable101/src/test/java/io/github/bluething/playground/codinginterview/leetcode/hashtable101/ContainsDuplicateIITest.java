package io.github.bluething.playground.codinginterview.leetcode.hashtable101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

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

    private boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> unique = new HashSet<>();
        int left = 0, right = 0;
        while (right < nums.length) {
            if (!unique.add(nums[right])) {
                return true;
            }
            if (right - left == k) {
                unique.remove(nums[left]);
                left++;
            }
            right++;
        }
        return false;
    }
}

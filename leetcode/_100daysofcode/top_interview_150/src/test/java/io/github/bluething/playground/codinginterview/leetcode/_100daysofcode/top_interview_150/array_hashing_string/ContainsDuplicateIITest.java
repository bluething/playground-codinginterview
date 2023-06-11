package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

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

    // using a Set as a duplicate detector
    // we only want to save k num in the set, so we need to maintain a sliding window within the set
    private boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) {
            return false;
        }

        Set<Integer> uniqueNums = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!uniqueNums.add(nums[i])) {
                return true;
            }

            if (i >= k) {
                uniqueNums.remove(nums[i-k]);
            }
            uniqueNums.add(nums[i]);
        }
        return false;
    }
}

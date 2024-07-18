package io.github.bluething.playground.codinginterview.leetcode.twopointers101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class _3sumTest {
    @Test
    void case01() {
        Assertions.assertEquals((List.of(List.of(-1,-1,2), List.of(-1,0,1))), threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(Collections.emptyList(), threeSum(new int[]{0,1,1}));
    }
    @Test
    void case03() {
        Assertions.assertEquals(List.of(List.of(0,0,0)), threeSum(new int[]{0,0,0}));
    }
    private List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int j = i+1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    res.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j-1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k+1]) {
                        k--;
                    }
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return res;
    }
}

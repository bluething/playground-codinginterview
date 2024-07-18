package io.github.bluething.playground.codinginterview.leetcode.twopointers101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class _3SumSmallerTest {
    @Test
    void case01(){
        Assertions.assertEquals(2, threeSumSmaller(new int[]{-2,0,1,3}, 2));
    }
    @Test
    void case02(){
        Assertions.assertEquals(2, threeSumSmaller(new int[]{-2,0,1,3}, 2));
    }
    private int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i+1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < target) {
                    counter += k - j;
                    j++;
                } else {
                    k--;
                }
            }
        }

        return counter;
    }
}

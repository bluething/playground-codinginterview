package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/product-of-array-except-self/
class ProductOfArrayExceptSelfTest {

    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{24,12,8,6}, productExceptSelf(new int[]{1,2,3,4}));
    }

    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{0,0,9,0,0}, productExceptSelf(new int[]{-1,1,0,-3,3}));
    }

    private int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int result = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                result *= nums[j];
            }
            answer[i] = result;
        }
        return answer;
    }
}

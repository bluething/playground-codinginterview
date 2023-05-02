package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.arrays_hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

// https://leetcode.com/problems/product-of-array-except-self/
// https://www.youtube.com/watch?v=bNvIQI2wAjk
class ProductOfArrayExceptSelfTest {

    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{24,12,8,6}, productExceptSelf(new int[]{1,2,3,4}));
    }

    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{0,0,9,0,0}, productExceptSelf(new int[]{-1,1,0,-3,3}));
    }

    @Test
    void case03() {
        Assertions.assertArrayEquals(new int[]{24,12,8,6}, productExceptSelf2(new int[]{1,2,3,4}));
    }

    @Test
    void case04() {
        Assertions.assertArrayEquals(new int[]{0,0,9,0,0}, productExceptSelf2(new int[]{-1,1,0,-3,3}));
    }

    @Test
    void case05() {
        Assertions.assertArrayEquals(new int[]{24,12,8,6}, productExceptSelf3(new int[]{1,2,3,4}));
    }

    @Test
    void case06() {
        Assertions.assertArrayEquals(new int[]{0,0,9,0,0}, productExceptSelf3(new int[]{-1,1,0,-3,3}));
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

    // 1-2-3-4
    // prefix
    // suffix
    private int[] productExceptSelf2(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        int[] suffix = new int[nums.length];
        suffix[nums.length-1] = 1;
        for (int i = nums.length-2; i >=0; i--) {
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        int[] answer = new int[nums.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = prefix[i] * suffix[i];
        }
        return answer;
    }

    // the key is prefix * postfix
    // but we use only 1 array
    // put prefix result first
    // then calculate the postfix and multiply by the prefix
    private int[] productExceptSelf3(int[] nums) {
        int[] answer = new int[nums.length];
        // prefix
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] = prefix;
            prefix *= nums[i];
        }
        // postfix
        int postfix = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            answer[i] *= postfix;
            postfix *= nums[i];
        }

        return answer;
    }
}

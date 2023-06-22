package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/product-of-array-except-self/?envType=study-plan-v2&envId=top-interview-150
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

    // the idea is we store the prefix and suffix sum for each element
    //        1-2-3-4
    // prefix 1-1-2-6
    // suffix 24-12-4-1
    // the answer is multiplication from prefix and suffix
    private int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        int[] suffix = new int[nums.length];
        suffix[nums.length-1] = 1;
        for (int i = nums.length-2; i >= 0; i--) {
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = prefix[i] * suffix[i];
        }
        return answer;
    }

    // productExceptSelf() have a O(n) space
    // actually we don't need the prefix and suffix array
    // just update the answer array
    private int[] productExceptSelf2(int[] nums) {
        int[] answer = new int[nums.length];
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] = prefix;
            prefix *= nums[i];
        }

        // careful, when works with suffix we need to multiple each node with current suffix
        // because answer array already fill by prefix sum
        int suffix = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;
    }
}

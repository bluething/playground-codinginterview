package io.github.bluething.playground.codinginterview.leetcode.stackqueue101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class NextGreaterElementITest {
    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{-1,3,-1}, nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2}));
    }
    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{3,-1}, nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4}));
    }
    private int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> greaterPairs = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                int top = stack.pop();
                greaterPairs.put(top, nums2[i]);
            }
            stack.push(nums2[i]);
        }
        while (!stack.isEmpty()) {
            int top = stack.pop();
            greaterPairs.put(top, -1);
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = greaterPairs.get(nums1[i]);
        }
        return res;
    }
}

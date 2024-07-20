package io.github.bluething.playground.codinginterview.leetcode.stackqueue101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Stack;

class NextGreaterElementIITest {
    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{2,-1,2}, nextGreaterElements(new int[]{1,2,1}));
    }
    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{2,3,4,-1,4}, nextGreaterElements(new int[]{1,2,3,4,3}));
    }

    private int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int currNum;
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);
        for (int i = 0; i < nums.length; i++) {
            currNum = nums[i];
            while (!stack.isEmpty() && nums[stack.peek()] < currNum) {
                result[stack.pop()] = currNum;
            }
            stack.push(i);
        }
        for (int num : nums) {
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                int curIdx = stack.pop();
                result[curIdx] = num;
            }
            if (stack.isEmpty()) {
                break;
            }
        }
        return result;
    }
}

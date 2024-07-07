package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindPivotIndexTest {
    @Test
    void case01() {
        Assertions.assertEquals(3, pivotIndex(new int[]{1,7,3,6,5,6}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(-1, pivotIndex(new int[]{1,2,3}));
    }
    @Test
    void case03() {
        Assertions.assertEquals(0, pivotIndex(new int[]{2,1,-1}));
    }
    @Test
    void case04() {
        Assertions.assertEquals(2, pivotIndex(new int[]{-1,-1,0,0,-1,-1}));
    }
    @Test
    void case05() {
        Assertions.assertEquals(5, pivotIndex(new int[]{-1,-1,0,1,1,0}));
    }

    private int pivotIndex(int[] nums) {
        int pivot = -1;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int leftSum = 0;
        int rightSum = sum;
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                pivot = i;
                break;
            }
            leftSum += nums[i];
        }

        return pivot;
    }
}

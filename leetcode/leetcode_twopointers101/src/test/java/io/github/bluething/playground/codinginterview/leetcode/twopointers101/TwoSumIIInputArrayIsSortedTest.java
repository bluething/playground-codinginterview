package io.github.bluething.playground.codinginterview.leetcode.twopointers101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumIIInputArrayIsSortedTest {
    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{1,2}, twoSum(new int[]{2,7,11,15}, 9));
    }
    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{1,3}, twoSum(new int[]{2,3,4}, 6));
    }
    @Test
    void case03() {
        Assertions.assertArrayEquals(new int[]{1,2}, twoSum(new int[]{-1,0}, -1));
    }
    private int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length-1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left+1, right+1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{};
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/?envType=study-plan-v2&envId=top-interview-150
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

    @Test
    void case04() {
        Assertions.assertArrayEquals(new int[]{1,2}, twoSum2(new int[]{2,7,11,15}, 9));
    }

    @Test
    void case05() {
        Assertions.assertArrayEquals(new int[]{1,3}, twoSum2(new int[]{2,3,4}, 6));
    }

    @Test
    void case06() {
        Assertions.assertArrayEquals(new int[]{1,2}, twoSum2(new int[]{-1,0}, -1));
    }

    @Test
    void case07() {
        Assertions.assertArrayEquals(new int[]{1,2}, twoSum3(new int[]{2,7,11,15}, 9));
    }

    @Test
    void case08() {
        Assertions.assertArrayEquals(new int[]{1,3}, twoSum3(new int[]{2,3,4}, 6));
    }

    @Test
    void case09() {
        Assertions.assertArrayEquals(new int[]{1,2}, twoSum3(new int[]{-1,0}, -1));
    }

    private int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> remainders = new HashMap<>();
        remainders.put(target - numbers[0], 1);
        for (int i = 1; i < numbers.length; i++) {
            if (remainders.get(numbers[i]) != null) {
                return new int[]{remainders.get(numbers[i]), i+1};
            }
            remainders.put(target - numbers[i], i+1);
        }
        return new int[2];
    }

    private int[] twoSum2(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int sum = 0;
        while (i < j) {
            sum = numbers[i] + numbers[j];
            if (sum == target) {
                i++;
                j++;
                break;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[]{i,j};
    }

    private int[] twoSum3(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int sum = 0;
        while (i < j) {
            sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i+1, j+1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[1];
    }
}

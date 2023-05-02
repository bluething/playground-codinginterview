package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIIInputArrayIsSortedTest {

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
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i+1, j+1};
                }
            }
        }
        return new int[2];
    }

    private int[] twoSum2(int[] numbers, int target) {
        Map<Integer, Integer> pairs = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (pairs.get(target - numbers[i]) != null) {
                return new int[]{pairs.get(target - numbers[i])+1, i+1};
            }
            pairs.put(numbers[i], i);
        }
        return new int[2];
    }

    private int[] twoSum3(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[]{i+1, j+1};
            }
            if (numbers[i] + numbers[j] <= target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[2];
    }
}

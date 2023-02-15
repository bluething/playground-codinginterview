package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.parttwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

class NumberOfArithmeticTripletsTest {

    @Test
    void case01() {
        Assertions.assertEquals(2, arithmeticTriplets(new int[]{0,1,4,6,7,10}, 3));
    }

    @Test
    void case02() {
        Assertions.assertEquals(2, arithmeticTriplets(new int[]{4,5,6,7,8,9}, 2));
    }

    @Test
    void case03() {
        Assertions.assertEquals(2, arithmeticTriplets2(new int[]{0,1,4,6,7,10}, 3));
    }

    @Test
    void case04() {
        Assertions.assertEquals(2, arithmeticTriplets2(new int[]{4,5,6,7,8,9}, 2));
    }

    private int arithmeticTriplets(int[] nums, int diff) {
        int result = 0;
        // 3 consecutive pointers
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i+1;
            int k = j+1;
            while (k < nums.length) {
                if (nums[j] - nums[i] == diff &&
                nums[k] - nums[j] == diff) {
                    // we find the pairs, move the pointers to the next candidate
                    j++;
                    k++;
                    result++;
                } else if (nums[k] - nums[j] < diff) {
                    // the diff is not enough, need to find bigger value, move k to the right
                    k++;
                } else {
                    // the diff was exceeded criteria, make the loop false
                    j++;
                }
            }
        }

        return result;
    }

    // from problem description we can see that
    // nums[j] - nums[i] == diff
    // nums[k] - nums[j] == diff
    // ------------------------- +
    // nums[k] - nums[i] = 2*diff => nums[i] - 2*diff = nums[k]
    // so we only need to care about nums[i] -> single loop
    private int arithmeticTriplets2(int[] nums, int diff) {
        int result = 0;
        Set<Integer> visitedValues = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            // check if the set contain values from above formula
            if (visitedValues.contains(nums[i] - diff) &&
            visitedValues.contains(nums[i] - 2 * diff)) {
                result++;
            }
            visitedValues.add(nums[i]);
        }

        return result;
    }
}

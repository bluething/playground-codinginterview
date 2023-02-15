package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.parttwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberOfArithmeticTripletsTest {

    @Test
    void case01() {
        Assertions.assertEquals(2, arithmeticTriplets(new int[]{0,1,4,6,7,10}, 3));
    }

    @Test
    void case02() {
        Assertions.assertEquals(2, arithmeticTriplets(new int[]{4,5,6,7,8,9}, 2));
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
}

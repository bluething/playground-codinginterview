package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfArithmeticTripletsTest {

    @Test
    public void case01() {
        Assertions.assertEquals(2, arithmeticTriplets(new int[]{0,1,4,6,7,10}, 3));
    }

    @Test
    public void case02() {
        Assertions.assertEquals(2, arithmeticTriplets(new int[]{4,5,6,7,8,9}, 2));
    }

    private int arithmeticTriplets(int[] nums, int diff) {
        int result = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i+1; j < nums.length - 1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if ((nums[k] - nums[j] == diff) &&
                            (nums[j] - nums[i] == diff)) {
                        result++;
                    }
                }
            }
        }

        return result;
    }
}

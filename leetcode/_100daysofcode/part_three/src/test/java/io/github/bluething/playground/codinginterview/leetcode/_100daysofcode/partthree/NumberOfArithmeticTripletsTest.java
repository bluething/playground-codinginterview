package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

// https://leetcode.com/problems/number-of-arithmetic-triplets/
public class NumberOfArithmeticTripletsTest {
    @Test
    public void case01() {
        Assertions.assertEquals(2, arithmeticTriplets(new int[]{0,1,4,6,7,10}, 3));
    }

    @Test
    public void case02() {
        Assertions.assertEquals(2, arithmeticTriplets(new int[]{4,5,6,7,8,9}, 2));
    }

    @Test
    public void case03() {
        Assertions.assertEquals(2, arithmeticTriplets2(new int[]{0,1,4,6,7,10}, 3));
    }

    @Test
    public void case04() {
        Assertions.assertEquals(2, arithmeticTriplets2(new int[]{4,5,6,7,8,9}, 2));
    }

    private int arithmeticTriplets(int[] nums, int diff) {
        int result = 0;
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[j]-nums[i] == diff
                    && nums[k]-nums[j] == diff) {
                        result++;
                    }
                }
            }
        }

        return result;
    }

    private int arithmeticTriplets2(int[] nums, int diff) {
        int result = 0;
        for (int i = 0; i < nums.length-2; i++) {
            int j = i+1;
            int k = j+1;
            while (k < nums.length) {
                if (nums[j]-nums[i] == diff
                        && nums[k]-nums[j] == diff) {
                    result++;
                    j++;
                    k--;
                } else if (nums[k]-nums[j] < diff) {
                    k++;
                } else {
                    j++;
                }
            }
        }

        return result;
    }
}

package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxConsecutiveOnesTest {

    @Test
    void case01() {
        Assertions.assertEquals(3, findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(2, findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
    }

    private int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count = 0;
            } else {
                count++;
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, count);
            }
        }

        return maxConsecutiveOnes;
    }
}

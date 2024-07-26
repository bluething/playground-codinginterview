package io.github.bluething.playground.codinginterview.leetcode.slidingwindow101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxConsecutiveOnesIITest {
    @Test
    void case01() {
        Assertions.assertEquals(4, findMaxConsecutiveOnes(new int[]{1,0,1,1,0}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(4, findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
    }
    private int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return n;
        }

        int left = 0, right = 0;
        int maxLength = 0, counterOf0 = 0;
        while (right < n) {
            if (nums[right] == 0) {
                counterOf0++;
            }
            while (counterOf0 > 1) {
                if (nums[left] == 0) {
                    counterOf0--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }
}

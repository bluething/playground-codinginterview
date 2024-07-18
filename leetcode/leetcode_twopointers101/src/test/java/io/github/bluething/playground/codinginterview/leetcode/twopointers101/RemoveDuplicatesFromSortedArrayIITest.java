package io.github.bluething.playground.codinginterview.leetcode.twopointers101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArrayIITest {
    @Test
    void case01() {
        Assertions.assertEquals(5, removeDuplicates(new int[]{1,1,1,2,2,3}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(7, removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
    }
    private int removeDuplicates(int[] nums) {
        int left = 0, right = 1, counter = 0;
        while (right < nums.length) {
            if (nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
                counter = 0;
            } else if (nums[left] == nums[right] && counter < 1) {
                counter++;
                nums[++left] = nums[right];
            }
            right++;
        }
        return left+1;
    }
}

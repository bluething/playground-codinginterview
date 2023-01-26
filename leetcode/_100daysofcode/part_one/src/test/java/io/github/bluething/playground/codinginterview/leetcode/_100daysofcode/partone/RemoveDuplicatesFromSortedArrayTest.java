package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// problem https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void case01() {
        Assertions.assertEquals(2, removeDuplicates(new int[]{1,1,2}));
    }

    @Test
    public void case02() {
        Assertions.assertEquals(5, removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }


    private int removeDuplicates(int[] nums) {
        int numOfUniqueElements = 1;
        int j = 1;
        for (int i = 0; i < nums.length-1; i++) {
            while (j < nums.length) {
                if (nums[i] != nums[j]) {
                    nums[i+1] = nums[j];
                    numOfUniqueElements++;
                    break;
                }
                j++;
            }
        }

        return numOfUniqueElements;
    }
}

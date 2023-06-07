package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void case01() {
        Assertions.assertEquals(2, removeDuplicates(new int[]{1,1,2}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(5, removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    // we need a pointer pointing to unique num
    // when we found element that have value not equal to previous element then increment the pointer (pointing to the next duplicate)
    // then we assign the value to the element pointed by the pointer
    private int removeDuplicates(int[] nums) {
        int uniquePointer = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                uniquePointer++;
                nums[uniquePointer] = nums[i];
            }
        }
        return uniquePointer+1;
    }
}

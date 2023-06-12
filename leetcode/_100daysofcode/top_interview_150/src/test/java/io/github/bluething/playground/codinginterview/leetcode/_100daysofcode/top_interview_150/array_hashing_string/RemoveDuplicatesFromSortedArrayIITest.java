package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
class RemoveDuplicatesFromSortedArrayIITest {

    @Test
    void case01() {
        Assertions.assertEquals(5, removeDuplicates(new int[]{1,1,1,2,2,3}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(7, removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
    }

    @Test
    void case03() {
        Assertions.assertEquals(5, removeDuplicates2(new int[]{1,1,1,2,2,3}));
    }

    @Test
    void case04() {
        Assertions.assertEquals(7, removeDuplicates2(new int[]{0,0,1,1,1,1,2,3,3}));
    }

    // two pointers, i pointer for new (result array) and j for input array
    // when we meet the same value and the unique count less than sliding window
    // replace value pointed by i with value pointed by j and increment the i
    // increment the unique count
    // if we find different value then restart unique count with 1 and replace value pointed by i with value pointed by j and increment the i
    private int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        final int window = 2;
        int i = 1;
        int uniqueCount = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[j-1]) {
                if (uniqueCount < window) {
                    nums[i++] = nums[j];
                }
                uniqueCount++;
            } else {
                uniqueCount = 1;
                nums[i++] = nums[j];
            }
        }

        return i;
    }

    // i pointed to 3rd or higher of the same value
    // j pointed to candidate to replace the i
    private int removeDuplicates2(int[] nums) {
        if (nums.length < 3) {
            return nums.length;
        }
        int i = 2;
        for (int j = i; j < nums.length; j++) {
            if (nums[j] != nums[i-2]) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/remove-element/?envType=study-plan-v2&id=top-interview-150
class RemoveElementTest {

    @Test
    void case01() {
        Assertions.assertEquals(2, removeElement(new int[]{3,2,2,3}, 3));
    }

    @Test
    void case02() {
        Assertions.assertEquals(5, removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    @Test
    void case03() {
        Assertions.assertEquals(2, removeElement2(new int[]{3,2,2,3}, 3));
    }

    @Test
    void case04() {
        Assertions.assertEquals(5, removeElement2(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    // foreach not equal value with val, swap the value
    private int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    // foreach not equal value with val, swap the value with the value in the last idx
    // reduce the idx
    private int removeElement2(int[] nums, int val) {
        int i = 0;
        int j = nums.length-1;
        while (i < j) {
            if (nums[i] == val) {
                nums[i] = nums[j];
                j--;
            }
            i++;
        }

        return j;
    }
}

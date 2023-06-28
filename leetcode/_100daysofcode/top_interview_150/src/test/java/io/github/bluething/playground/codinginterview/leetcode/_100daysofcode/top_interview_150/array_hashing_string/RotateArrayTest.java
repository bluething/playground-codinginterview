package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150
class RotateArrayTest {

    @Test
    void case01() {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        rotate(arr, 3);
        Assertions.assertArrayEquals(new int[]{5,6,7,1,2,3,4}, arr);
    }

    @Test
    void case02() {
        int[] arr = new int[]{-1,-100,3,99};
        rotate(arr, 2);
        Assertions.assertArrayEquals(new int[]{3,99,-1,-100}, arr);
    }


    private void rotate(int[] nums, int k) {

    }
}

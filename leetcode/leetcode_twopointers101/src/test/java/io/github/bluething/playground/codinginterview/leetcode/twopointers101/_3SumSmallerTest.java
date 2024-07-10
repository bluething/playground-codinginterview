package io.github.bluething.playground.codinginterview.leetcode.twopointers101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class _3SumSmallerTest {
    @Test
    void case01(){
        Assertions.assertEquals(2, threeSumSmaller(new int[]{-2,0,1,3}, 2));
    }
    @Test
    void case02(){
        Assertions.assertEquals(3, threeSumSmaller(new int[]{-2,0,1,3}, 2));
    }
    private int threeSumSmaller(int[] nums, int target) {
        // Write your code here
    }
}

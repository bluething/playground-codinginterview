package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/two-sum-less-than-k/
// Given an array A of integers and integer K, return the maximum S such that there exists i < j with A[i] + A[j] = S and S < K
// If no i, j exist satisfying this equation, return -1.
class TwoSumLessThanKTest {

    @Test
    void case01() {
        Assertions.assertEquals(58, twoSumLessThanK(new int[]{34,23,1,24,75,33,54,8}, 60));
    }

    @Test
    void case02() {
        Assertions.assertEquals(58, twoSumLessThanK(new int[]{10,20,30}, 15));
    }

    private int twoSumLessThanK(int[] A, int K) {
        return -1;
    }
}

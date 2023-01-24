package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// problem https://leetcode.com/problems/maximum-difference-between-increasing-elements/
public class MaximumDifferenceBetweenIncreasingElementsTest {

    @Test
    public void case01() {
        Assertions.assertEquals(4, maximumDifference(new int[]{7,1,5,4}));
    }

    @Test
    public void case02() {
        Assertions.assertEquals(-1, maximumDifference(new int[]{9,4,3,2}));
    }

    @Test
    public void case03() {
        Assertions.assertEquals(9, maximumDifference(new int[]{1,5,2,10}));
    }

    private int maximumDifference(int[] nums) {
        int maxDiff = -1;

        return maxDiff;
    }
}

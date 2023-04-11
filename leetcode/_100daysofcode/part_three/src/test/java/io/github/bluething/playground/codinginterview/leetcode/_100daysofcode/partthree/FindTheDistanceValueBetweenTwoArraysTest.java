package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/find-the-distance-value-between-two-arrays/description/
class FindTheDistanceValueBetweenTwoArraysTest {

    @Test
    void case01() {
        Assertions.assertEquals(2, findTheDistanceValue(new int[]{4,5,8}, new int[]{10,9,1,8}, 2));
    }

    @Test
    void case02() {
        Assertions.assertEquals(2, findTheDistanceValue(new int[]{1,4,2,3}, new int[]{-4,-3,6,10,20,30}, 3));
    }

    @Test
    void case03() {
        Assertions.assertEquals(1, findTheDistanceValue(new int[]{2,1,100,3}, new int[]{-5,-2,10,-3,7}, 6));
    }

    private int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        return 0;
    }
}

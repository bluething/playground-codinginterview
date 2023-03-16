package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumIIInputArrayIsSortedTest {

    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{1,2}, twoSum(new int[]{2,7,11,15}, 9));
    }

    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{1,3}, twoSum(new int[]{2,3,4}, 6));
    }

    @Test
    void case03() {
        Assertions.assertArrayEquals(new int[]{1,2}, twoSum(new int[]{-1,0}, -1));
    }

    private int[] twoSum(int[] numbers, int target) {
        
        return new int[2];
    }
}

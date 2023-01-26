package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// problem https://leetcode.com/problems/plus-one/
public class PlusOneTest {

    @Test
    public void case01() {
        Assertions.assertArrayEquals(new int[]{1,2,4}, plusOne(new int[]{1,2,3}));
    }

    @Test
    public void case02() {
        Assertions.assertArrayEquals(new int[]{4,3,2,1}, plusOne(new int[]{4,3,2,1}));
    }
    @Test
    public void case03() {
        Assertions.assertArrayEquals(new int[]{1,0}, plusOne(new int[]{9}));
    }

    private int[] plusOne(int[] digits) {
        return new int[]{};
    }
}

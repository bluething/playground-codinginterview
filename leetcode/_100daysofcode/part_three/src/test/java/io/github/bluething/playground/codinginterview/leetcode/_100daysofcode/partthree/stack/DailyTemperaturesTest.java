package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/daily-temperatures/
class DailyTemperaturesTest {

    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{1,1,4,2,1,1,0,0}, dailyTemperatures(new int[]{73,74,75,71,69,72,76,73}));
    }

    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{1,1,1,0}, dailyTemperatures(new int[]{30,40,50,60}));
    }

    @Test
    void case03() {
        Assertions.assertArrayEquals(new int[]{1,1,0}, dailyTemperatures(new int[]{30,60,90}));
    }

    private int[] dailyTemperatures(int[] temperatures) {
        return null;
    }
}

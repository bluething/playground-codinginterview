package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MinimumProcessingTimeTest {
    @Test
    void case01() {
        Assertions.assertEquals(16, minProcessingTime(List.of(8,10), List.of(2,2,3,1,8,7,4,5)));
    }
    @Test
    void case02() {
        Assertions.assertEquals(23, minProcessingTime(List.of(10,20), List.of(2,3,1,2,5,8,4,3)));
    }

    private int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        return Integer.MAX_VALUE;
    }
}

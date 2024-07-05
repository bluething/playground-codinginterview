package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MinimumTimeDifferenceTest {
    @Test
    void case01() {
        Assertions.assertEquals(1, findMinDifference(List.of("23:59","00:00")));
    }
    @Test
    void case02() {
        Assertions.assertEquals(0, findMinDifference(List.of("00:00","23:59","00:00")));
    }

    private int findMinDifference(List<String> timePoints) {
        return 0;
    }
}

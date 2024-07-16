package io.github.bluething.playground.codinginterview.leetcode.stackqueue101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarFleetTest {
    @Test
    void case01() {
        Assertions.assertEquals(3, carFleet(12, new int[]{10,8,0,5,3}, new int[]{2,4,1,1,3}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(1, carFleet(10, new int[]{3}, new int[]{3}));
    }
    @Test
    void case03() {
        Assertions.assertEquals(100, carFleet(10, new int[]{0,2,4}, new int[]{4,2,1}));
    }

    private int carFleet(int target, int[] position, int[] speed) {
        return 0;
    }
}

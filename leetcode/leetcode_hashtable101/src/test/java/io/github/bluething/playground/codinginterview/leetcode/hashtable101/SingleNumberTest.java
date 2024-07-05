package io.github.bluething.playground.codinginterview.leetcode.hashtable101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingleNumberTest {
    @Test
    void case01() {
        Assertions.assertEquals(1, singleNumber(new int[]{2,1,1}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(4, singleNumber(new int[]{4,1,2,1,2}));
    }
    @Test
    void case03() {
        Assertions.assertEquals(1, singleNumber(new int[]{1}));
    }

    private int singleNumber(int[] nums) {
        return 0;
    }
}

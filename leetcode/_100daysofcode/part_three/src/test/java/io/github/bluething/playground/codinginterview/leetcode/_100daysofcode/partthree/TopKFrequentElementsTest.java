package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/top-k-frequent-elements/
class TopKFrequentElementsTest {

    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{1,2}, topKFrequent(new int[]{1,1,1,2,2,3}, 2));
    }

    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{1}, topKFrequent(new int[]{1}, 1));
    }

    private int[] topKFrequent(int[] nums, int k) {
        return null;
    }
}

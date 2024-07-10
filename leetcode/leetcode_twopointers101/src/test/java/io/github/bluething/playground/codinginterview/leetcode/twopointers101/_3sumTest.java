package io.github.bluething.playground.codinginterview.leetcode.twopointers101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

class _3sumTest {
    @Test
    void case01() {
        Assertions.assertEquals((List.of(List.of(-1,-1,2), List.of(-1,0,1))), threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(Collections.emptyList(), threeSum(new int[]{0,1,1}));
    }
    @Test
    void case03() {
        Assertions.assertEquals(List.of(List.of(0,0,0)), threeSum(new int[]{0,0,0}));
    }
    private List<List<Integer>> threeSum(int[] nums) {
        return null;
    }
}

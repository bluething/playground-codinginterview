package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/subsets-ii/
class SubsetsIITest {

    @Test
    void case01() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(),
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(1,2),
                Arrays.asList(3),
                Arrays.asList(1,3),
                Arrays.asList(2,3),
                Arrays.asList(1,2,3)), subsetsWithDup(new int[]{1,2,2}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(),
                Arrays.asList(0)), subsetsWithDup(new int[]{0}));
    }

    private List<List<Integer>> subsetsWithDup(int[] nums) {
        return null;
    }
}

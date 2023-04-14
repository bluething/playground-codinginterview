package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/subsets/description/
class SubsetsTest {

    @Test
    void case01() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(),
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(1,2),
                Arrays.asList(3),
                Arrays.asList(1,3),
                Arrays.asList(2,3),
                Arrays.asList(1,2,3)), subsets(new int[]{1,2,3}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(),
                Arrays.asList(0)), subsets(new int[]{0}));
    }

    private List<List<Integer>> subsets(int[] nums) {
        return null;
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/combination-sum/
class CombinationSumTest {

    @Test
    void case01() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(2,2,3),
                Arrays.asList(7)),
                combinationSum(new int[]{2,3,6,7}, 7));
    }

    @Test
    void case02() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(2,2,2,2),
                        Arrays.asList(2,3,3),
                        Arrays.asList(3,5)),
                combinationSum(new int[]{2,3,5}, 8));
    }

    @Test
    void case03() {
        Assertions.assertEquals(Collections.emptyList(),
                combinationSum(new int[]{2}, 1));
    }

    private List<List<Integer>> combinationSum(int[] candidates, int target) {
        return null;
    }
}

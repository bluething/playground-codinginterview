package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/combination-sum-ii/description/
class CombinationSumIITest {

    @Test
    void case01() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(1, 1, 6),
                        Arrays.asList(1, 2, 5),
                        Arrays.asList(1, 7),
                        Arrays.asList(2,6)),
                combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }

    @Test
    void case02() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(1,2,2),
                        Arrays.asList(5)),
                combinationSum2(new int[]{2,5,2,1,2}, 5));
    }

    private List<List<Integer>> combinationSum2(int[] candidates, int target) {
        return null;
    }
}

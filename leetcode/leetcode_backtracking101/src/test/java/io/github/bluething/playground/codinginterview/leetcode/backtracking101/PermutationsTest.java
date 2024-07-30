package io.github.bluething.playground.codinginterview.leetcode.backtracking101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutationsTest {
    @Test
    void case01() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(1,2,3),
                Arrays.asList(1,3,2),
                Arrays.asList(2,1,3),
                Arrays.asList(2,3,1),
                Arrays.asList(3,1,2),
                Arrays.asList(3,2,1)), permute(new int[]{1,2,3}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(0,1),
                Arrays.asList(1,0)), permute(new int[]{0,1}));
    }

    @Test
    void case03() {
        Assertions.assertEquals(List.of(List.of(1)), permute(new int[]{1}));
    }

    private List<List<Integer>> permute(int[] nums) {
        return Collections.emptyList();
    }
}

package io.github.bluething.playground.codinginterview.leetcode.backtracking101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationSumIIITest {
    @Test
    void case01() {
        Assertions.assertEquals(List.of(List.of(1,2,3)), combinationSum3(3, 7));
    }
    @Test
    void case02() {
        Assertions.assertEquals(List.of(List.of(1,2,6), List.of(1,3,5), List.of(2,3,4)), combinationSum3(3, 9));
    }
    @Test
    void case03() {
        Assertions.assertEquals(Collections.emptyList(), combinationSum3(4, 1));
    }

    private List<List<Integer>> combinationSum3(int k, int n) {
        return Collections.emptyList();
    }
}

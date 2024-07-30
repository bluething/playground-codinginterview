package io.github.bluething.playground.codinginterview.leetcode.backtracking101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

class CombinationsTest {
    @Test
    void case01() {
        Assertions.assertEquals(List.of(List.of(1,2), List.of(1,3), List.of(1,4), List.of(2,3), List.of(2,4), List.of(3,4)), combine(4, 2));
    }
    @Test
    void case02() {
        Assertions.assertEquals(List.of(List.of(1)), combine(1, 1));
    }
    private List<List<Integer>> combine(int n, int k) {
        return Collections.emptyList();
    }
}

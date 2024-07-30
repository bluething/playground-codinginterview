package io.github.bluething.playground.codinginterview.leetcode.backtracking101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class NQueensTest {
    @Test
    void case01() {
        Assertions.assertEquals(List.of(List.of(".Q..","...Q","Q...","..Q."), List.of("..Q.","Q...","...Q",".Q..")), solveNQueens(4));
    }
    @Test
    void case02() {
        Assertions.assertEquals(List.of(List.of("Q")), solveNQueens(1));
    }
    private List<List<String>> solveNQueens(int n) {
        return Collections.emptyList();
    }
}

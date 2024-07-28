package io.github.bluething.playground.codinginterview.leetcode.string101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WordSearchTest {
    @Test
    void case01() {
        Assertions.assertTrue(exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCCED"));
    }
    @Test
    void case02() {
        Assertions.assertTrue(exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "SEE"));
    }
    @Test
    void case03() {
        Assertions.assertFalse(exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCB"));
    }

    private boolean exist(char[][] board, String word) {
        return false;
    }
}
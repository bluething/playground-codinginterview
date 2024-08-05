package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class ValidSudokuTest {
    @Test
    void case01() {
        Assertions.assertTrue(isValidSudoku(new char[][]{{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}}));
    }

    @Test
    void case02() {
        Assertions.assertFalse(isValidSudoku(new char[][]{{'8','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}}));
    }

    private boolean isValidSudoku(char[][] board) {
        Map<Character, Integer>[] rows = new HashMap[9];
        Map<Character, Integer>[] cols = new HashMap[9];
        Map<Character, Integer>[] box = new HashMap[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashMap<>();
            cols[i] = new HashMap<>();
            box[i] = new HashMap<>();
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    char c = board[i][j];
                    if (rows[i].containsKey(c) || cols[j].containsKey(c) || box[(i/3)*3 + j/3].containsKey(c)) {
                        return false;
                    }

                    rows[i].put(c, i);
                    cols[j].put(c, j);
                    box[(i/3)*3 + j/3].put(c, i);
                }
            }
        }
        return true;
    }
}

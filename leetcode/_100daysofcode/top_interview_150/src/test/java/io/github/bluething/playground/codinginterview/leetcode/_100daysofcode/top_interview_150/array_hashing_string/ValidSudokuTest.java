package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/problems/valid-sudoku/?envType=study-plan-v2&envId=top-interview-150
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

    @Test
    void case03() {
        Assertions.assertTrue(isValidSudoku2(new char[][]{{'5','3','.','.','7','.','.','.','.'}
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
    void case04() {
        Assertions.assertFalse(isValidSudoku2(new char[][]{{'8','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}}));
    }

    // the idea was simple
    //  check if row is valid OR
    //  check if column is valid OR
    //  check if square is valid
    // from the requirement we can ignore if the values not solvable
    // if we want to use only 1 Set then we need to construct a String with some pattern contains cell coordinate and value
    // for square we can use formula x=i/3 and y=j/3
    // the drawback is string construction consume resource
    private boolean isValidSudoku(char[][] board) {
        Set<String> visited = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    if (!visited.add("row: " + i + ":" + board[i][j]) ||
                            !visited.add("col: " + j + ":" + board[i][j]) ||
                            !visited.add("square: " + i/3 + ":" + j/3 + ":" + board[i][j])) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    // if we want to avoid string construction then we need different collection as a helper to detect if we can satisfy this condition
    //  check if row is valid OR
    //  check if column is valid OR
    //  check if square is valid
    // the tricky part is how we map i,j to which square
    //  we can use this formula k = (i/3)*3 + j/3
    private boolean isValidSudoku2(char[][] board) {
        Map<Character, Integer>[] rows = new HashMap[9];
        Map<Character, Integer>[] cols = new HashMap[9];
        Map<Character, Integer>[] squares = new HashMap[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashMap<>();
            cols[i] = new HashMap<>();
            squares[i] = new HashMap<>();
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    char c = board[i][j];
                    if (rows[i].containsKey(c) ||
                            cols[j].containsKey(c) ||
                    squares[(i/3)*3 + j/3].containsKey(c)) {
                        return false;
                    }

                    rows[i].put(c,1);
                    cols[j].put(c,1);
                    squares[(i/3)*3 + j/3] .put(c,1);
                }
            }
        }

        return true;
    }
}

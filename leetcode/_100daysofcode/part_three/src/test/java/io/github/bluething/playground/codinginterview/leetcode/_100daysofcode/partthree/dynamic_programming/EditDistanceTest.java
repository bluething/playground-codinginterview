package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.dynamic_programming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/edit-distance/
class EditDistanceTest {

    private Map<List<Integer>, Integer> memo = new HashMap<>();

    @Test
    void case01() {
        Assertions.assertEquals(3, minDistance("horse", "ros"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(5, minDistance("intention", "execution"));
    }

    @Test
    void case03() {
        Assertions.assertEquals(7, minDistanceMemo("dinitrophenylhydrazine", "benzalphenylhydrazone"));
    }

    @Test
    void case04() {
        Assertions.assertEquals(3, minDistanceMemo("horse", "ros"));
    }

    @Test
    void case05() {
        Assertions.assertEquals(5, minDistanceMemo("intention", "execution"));
    }

    private int minDistance(String word1, String word2) {
        return editDistance(word1, word2, word1.length(), word2.length());
    }

    private int editDistance(String word1, String word2, int i, int j) {
        if (i == 0) {
            return j;
        }
        if (j == 0) {
            return i;
        }
        if (word1.charAt(i-1) == word2.charAt(j-1)) {
            return editDistance(word1, word2, i-1, j-1);
        }

        return 1 + Math.min(
                Math.min(editDistance(word1, word2, i, j-1)
                        , editDistance(word1, word2, i-1, j))
                , editDistance(word1, word2, i-1, j-1));
    }

    private int minDistanceMemo(String word1, String word2) {
        return editDistanceMemo(word1, word2, word1.length(), word2.length());
    }

    private int editDistanceMemo(String word1, String word2, int i, int j) {
        if (i == 0) {
            return j;
        }
        if (j == 0) {
            return i;
        }

        if (memo.get(List.of(i,j)) != null) {
            System.out.printf("Grab distance for (%d,%d)\n", i, j);
            return memo.get(List.of(i,j));
        }

        int result = 0;
        if (word1.charAt(i-1) == word2.charAt(j-1)) {
            result = editDistanceMemo(word1, word2, i-1, j-1);
        } else {
            result = 1 + Math.min(
                    Math.min(editDistanceMemo(word1, word2, i, j-1)
                            , editDistanceMemo(word1, word2, i-1, j))
                    , editDistanceMemo(word1, word2, i-1, j-1));
        }

        memo.put(List.of(i,j), result);

        return result;
    }
}

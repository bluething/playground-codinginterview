package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/edit-distance/
class EditDistanceTest {

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
        Assertions.assertEquals(0, minDistance("dinitrophenylhydrazine", "benzalphenylhydrazone"));
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
}

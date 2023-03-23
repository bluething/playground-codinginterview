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

    private int minDistance(String word1, String word2) {
        return 0;
    }
}

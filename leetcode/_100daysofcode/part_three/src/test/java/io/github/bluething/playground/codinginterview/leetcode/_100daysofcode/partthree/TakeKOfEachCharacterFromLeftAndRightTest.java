package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/take-k-of-each-character-from-left-and-right/
class TakeKOfEachCharacterFromLeftAndRightTest {

    @Test
    void case01() {
        Assertions.assertEquals(8, takeCharacters("aabaaaacaabc", 2));
    }

    @Test
    void case02() {
        Assertions.assertEquals(-1, takeCharacters("a", 1));
    }

    private int takeCharacters(String s, int k) {
        return 0;
    }
}

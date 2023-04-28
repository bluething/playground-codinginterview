package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/decode-ways/
class DecodeWaysTest {

    @Test
    void case01() {
        Assertions.assertEquals(2, numDecodings("12"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(3, numDecodings("226"));
    }

    @Test
    void case03() {
        Assertions.assertEquals(0, numDecodings("06"));
    }

    private int numDecodings(String s) {
        return 0;
    }
}

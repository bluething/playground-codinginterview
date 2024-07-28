package io.github.bluething.playground.codinginterview.leetcode.string101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanToIntegerTest {
    @Test
    void case01() {
        Assertions.assertEquals(3, romanToInt("III"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(58, romanToInt("LVIII"));
    }

    @Test
    void case03() {
        Assertions.assertEquals(1994, romanToInt("MCMXCIV"));
    }

    private int romanToInt(String s) {
        return 0;
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partfour.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/roman-to-integer/?envType=study-plan-v2&envId=top-interview-150
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

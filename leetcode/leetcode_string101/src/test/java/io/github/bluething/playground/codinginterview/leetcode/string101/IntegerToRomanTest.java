package io.github.bluething.playground.codinginterview.leetcode.string101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntegerToRomanTest {
    @Test
    void case01() {
        Assertions.assertEquals("III", intToRoman(3));
    }

    @Test
    void case02() {
        Assertions.assertEquals("LVIII", intToRoman(58));
    }

    @Test
    void case03() {
        Assertions.assertEquals("MCMXCIV", intToRoman(1994));
    }

    private String intToRoman(int num) {
        return "";
    }
}

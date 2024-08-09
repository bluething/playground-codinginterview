package io.github.bluething.playground.codinginterview.leetcode.string101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ZigzagConversionTest {
    @Test
    void case01() {
        Assertions.assertEquals("PAHNAPLSIIGYIR", convert("PAYPALISHIRING", 3));
    }
    @Test
    void case02() {
        Assertions.assertEquals("PINALSIGYAHRPI", convert("PAYPALISHIRING", 4));
    }
    private String convert(String s, int numRows) {
        return "";
    }
}

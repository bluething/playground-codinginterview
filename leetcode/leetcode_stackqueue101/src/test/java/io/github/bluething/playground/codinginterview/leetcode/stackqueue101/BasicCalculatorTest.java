package io.github.bluething.playground.codinginterview.leetcode.stackqueue101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasicCalculatorTest {
    @Test
    void case01() {
        Assertions.assertEquals(2, calculate("1 + 1"));
    }
    @Test
    void case02() {
        Assertions.assertEquals(3, calculate("1 + 2"));
    }

    @Test
    void case03() {
        Assertions.assertEquals(23, calculate("(1+(4+5+2)-3)+(6+8)"));
    }
    private int calculate(String s) {
        return 0;
    }
}

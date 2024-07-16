package io.github.bluething.playground.codinginterview.leetcode.stackqueue101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasicCalculatorIITest {
    @Test
    void case01() {
        Assertions.assertEquals(7, calculate("3+2*2"));
    }
    @Test
    void case02() {
        Assertions.assertEquals(1, calculate(" 3/2 "));
    }
    @Test
    void case03() {
        Assertions.assertEquals(5, calculate(" 3+5 / 2 "));
    }
    private int calculate(String s) {
        return 0;
    }
}

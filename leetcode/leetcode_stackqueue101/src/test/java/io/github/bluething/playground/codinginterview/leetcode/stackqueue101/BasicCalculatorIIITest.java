package io.github.bluething.playground.codinginterview.leetcode.stackqueue101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasicCalculatorIIITest {
    @Test
    void case01() {
        Assertions.assertEquals(2, calculate("1 + 1"));
    }
    @Test
    void case02() {
        Assertions.assertEquals(4, calculate(" 6-4 / 2 "));
    }
    @Test
    void case03() {
        Assertions.assertEquals(21, calculate("2*(5+5*2)/3+(6/2+8)"));
    }
    @Test
    void case04() {
        Assertions.assertEquals(-12, calculate("(2+6* 3+5- (3*14/7+2)*5)+3"));
    }
    private int calculate(String s) {
        return 0;
    }
}

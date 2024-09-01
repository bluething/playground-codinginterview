package io.github.bluething.playground.codinginterview.coderbyte.coderbyte101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstFactorialTest {
    @Test
    void case01() {
        Assertions.assertEquals(24, FirstFactorial(4));
    }
    @Test
    void case02() {
        Assertions.assertEquals(40320, FirstFactorial(8));
    }
    private int FirstFactorial(int num) {
        int result = 1;
        while (num > 0) {
            result *= num;
            num--;
        }
        return result;
    }
}

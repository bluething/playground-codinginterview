package io.github.bluething.playground.codinginterview.hackerrank._1monthpreparationkit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// the key is "You will be given a list of 32 bit unsigned integers"
// 0xffffffffL = 4294967295 = 11111111111111111111111111111111 -> unsigned 32-bit integer
// change the input from 0 -> 1 (negation) then use and operator with 1 so we can get the flipped bit
class FlippingBitsTest extends ParentTest {
    @Test
    public void case01() {
        Assertions.assertEquals(2147483648L, flippingBits(2147483647L));
    }

    @Test
    public void case02() {
        Assertions.assertEquals(4294967294L, flippingBits(1L));
    }

    @Test
    public void case03() {
        Assertions.assertEquals(4294967295L, flippingBits(0L));
    }

    private long flippingBits(long n) {
        return ~n & 0xffffffffL;
    }
}

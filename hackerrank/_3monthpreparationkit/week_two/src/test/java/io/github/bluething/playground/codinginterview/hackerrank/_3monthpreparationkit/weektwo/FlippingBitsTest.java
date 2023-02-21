package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weektwo;

import io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.ParentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlippingBitsTest extends ParentTest {
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

    // Unsigned 32-bits of 1 is 00000000000000000000000000000001
    // 0xffffffffL = 4294967295 -> unsigned 32-bit integer
    // 0xffffffffL = 11111111111111111111111111111111
    // The bitwise complement (~) of any integer N is equal to - (N + 1)
    private long flippingBits(long n) {
        return ~n & 0xffffffffL;
    }
}

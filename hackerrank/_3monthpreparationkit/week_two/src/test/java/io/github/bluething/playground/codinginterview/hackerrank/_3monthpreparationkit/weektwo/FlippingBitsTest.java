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

    private long flippingBits(long n) {
        return ~n & 0xffffffffL;
    }
}

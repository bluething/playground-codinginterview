package io.github.bluething.playground.codinginterview.hackerrank._1weekpreparationkit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class LonelyIntegerTest {
    @Test
    void case01() {
        Assertions.assertEquals(4, lonelyinteger(List.of(1, 2, 3, 4, 3, 2, 1)));
    }

    // a ^ a = 0;
    // b ^ 0 = b;
    // b ^ a ^ a = b
    private int lonelyinteger(List<Integer> a) {
        return -1;
    }
}

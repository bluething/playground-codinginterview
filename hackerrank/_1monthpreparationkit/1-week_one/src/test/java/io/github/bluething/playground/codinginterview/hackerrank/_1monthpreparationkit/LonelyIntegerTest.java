package io.github.bluething.playground.codinginterview.hackerrank._1monthpreparationkit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class LonelyIntegerTest {
    @Test
    void case01() {
        Assertions.assertEquals(4, lonelyinteger(List.of(1, 2, 3, 4, 3, 2, 1)));
    }
    @Test
    void case02() {
        Assertions.assertEquals(4, lonelyinteger2(List.of(1, 2, 3, 4, 3, 2, 1)));
    }

    // a ^ a = 0;
    // b ^ 0 = b;
    // b ^ a ^ a = b
    private int lonelyinteger(List<Integer> a) {
        int loneInteger = 0;
        for (Integer integer : a) {
            loneInteger ^= integer;
        }
        return loneInteger;
    }

    private int lonelyinteger2(List<Integer> a) {
        int[] markers = new int[a.size() + 1];
        for (Integer integer : a) {
            if (markers[integer] == 0) {
                markers[integer]--;
            } else {
                markers[integer]++;
            }
        }
        for (int i = 0; i < markers.length; i++) {
            if (markers[i] < 0) {
                return i;
            }
        }

        return -1;
    }
}

package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weektwo;

import io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.ParentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/three-month-preparation-kit-lonely-integer/problem
public class LonelyIntegerTest extends ParentTest {

    @Test
    void case01() {
        Assertions.assertEquals(4, lonelyinteger(Arrays.asList(1, 2, 3, 4, 3, 2, 1)));
    }

    @Test
    void case02() {
        Assertions.assertEquals(4, lonelyinteger(Arrays.asList(1, 2, 3, 4, 3, 2, 1)));
    }

    // With XOR operator:
    //  n ^ 0 = n
    // m ^ m = 0
    // n ^ m ^ m = n
    private int lonelyinteger(List<Integer> a) {
        int lonely = 0;
        for (int val : a) {
            lonely = lonely ^ val;
        }
        return lonely;
    }
}

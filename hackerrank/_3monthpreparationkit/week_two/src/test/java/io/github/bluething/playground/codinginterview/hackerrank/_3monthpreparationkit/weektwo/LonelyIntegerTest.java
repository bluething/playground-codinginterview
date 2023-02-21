package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weektwo;

import io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.ParentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://www.hackerrank.com/challenges/three-month-preparation-kit-lonely-integer/problem
public class LonelyIntegerTest extends ParentTest {

    @Test
    void case01() {
        Assertions.assertEquals(4, lonelyinteger(Arrays.asList(1, 2, 3, 4, 3, 2, 1)));
    }

    @Test
    void case02() {
        Assertions.assertEquals(4, lonelyinteger2(Arrays.asList(1, 2, 3, 4, 3, 2, 1)));
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

    private int lonelyinteger2(List<Integer> a) {
        int[] marks = new int[101];
        for (int val : a) {
            if (marks[val] < 0) {
                marks[val]++;
            } else {
                marks[val]--;
            }
        }

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 0) {
                return i;
            }
        }

        return 0;
    }
}

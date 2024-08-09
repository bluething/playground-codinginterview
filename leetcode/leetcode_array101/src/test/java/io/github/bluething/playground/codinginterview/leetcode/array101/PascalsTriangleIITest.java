package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

class PascalsTriangleIITest {
    @Test
    void case01() {
        Assertions.assertEquals(List.of(1,3,3,1), getRow(3));
    }
    @Test
    void case02() {
        Assertions.assertEquals(List.of(1), getRow(0));
    }
    @Test
    void case03() {
        Assertions.assertEquals(List.of(1,1), getRow(1));
    }

    private List<Integer> getRow(int rowIndex) {
        return Collections.emptyList();
    }
}

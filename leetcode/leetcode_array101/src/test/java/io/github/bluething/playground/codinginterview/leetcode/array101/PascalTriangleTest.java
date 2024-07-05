package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PascalTriangleTest {
    @Test
    void case01() {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1),
                Arrays.asList(1,1),
                Arrays.asList(1,2,1),
                Arrays.asList(1,3,3,1),
                Arrays.asList(1,4,6,4,1));
        Assertions.assertEquals(expected, generate(5));
    }
    @Test
    void case02() {
        List<List<Integer>> expected = List.of(List.of(1));
        Assertions.assertEquals(expected, generate(1));
    }

    private List<List<Integer>> generate(int numRows) {
        return null;
    }
}

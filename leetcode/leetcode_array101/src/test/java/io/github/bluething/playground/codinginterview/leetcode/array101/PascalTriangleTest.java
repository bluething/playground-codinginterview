package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
        List<List<Integer>> result = new ArrayList<>();
        if (numRows < 1) {
            return result;
        }

        result.add(List.of(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// problem https://leetcode.com/problems/pascals-triangle/
public class PascalTriangleTest {

    @Test
    public void case01() {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1),
                Arrays.asList(1, 3, 3, 1),
                Arrays.asList(1, 4, 6, 4, 1));
        Assertions.assertEquals(expected, generate(5));
    }

    private List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));

        List<Integer> currentRow;
        List<Integer> prevRow;
        for (int i = 1; i < numRows; i++) {
            currentRow = new ArrayList<>();
            prevRow = result.get(i-1);
            currentRow.add(1);
            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            currentRow.add(1);
            result.add(currentRow);
        }

        return result;
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangleIITest {
    @Test
    public void case01() {
        List<Integer> expected = Arrays.asList(1,3,3,1);
        Assertions.assertEquals(expected, getRow(3));
    }

    @Test
    public void case02() {
        List<Integer> expected = Arrays.asList(1);
        Assertions.assertEquals(expected, getRow(0));
    }

    private List<Integer> getRow(int rowIndex) {
        List<Integer> currentRow = new ArrayList<>();
        // init 1st row (idx 0)
        currentRow.add(1);
        List<Integer> prevRow;

        // start from 2nd row (idx 1)
        // iterate until i == rowIndex because the rowIndex represent line+1
        for (int i = 1; i <= rowIndex; i++) {
            prevRow = currentRow;
            currentRow = new ArrayList<>();
            currentRow.add(1);
            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j-1) + prevRow.get(j));
            }
            currentRow.add(1);
        }

        return currentRow;
    }
}

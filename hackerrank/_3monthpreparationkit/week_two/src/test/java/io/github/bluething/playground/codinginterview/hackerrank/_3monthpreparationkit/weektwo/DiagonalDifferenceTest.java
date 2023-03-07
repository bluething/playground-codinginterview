package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weektwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/three-month-preparation-kit-diagonal-difference/problem
public class DiagonalDifferenceTest {
    @Test
    public void case01() {
        List<List<Integer>> arr = Arrays.asList(Arrays.asList(11, 2, 4),
                Arrays.asList(4, 5, 6),
                Arrays.asList(10, 8, -12));

        Assertions.assertEquals(15, diagonalDifference(arr));
    }

    @Test
    public void case02() {
        List<List<Integer>> arr = Arrays.asList(Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(9, 8, 9));

        Assertions.assertEquals(2, diagonalDifference(arr));
    }

    private int diagonalDifference(List<List<Integer>> arr) {
        return 0;
    }
}

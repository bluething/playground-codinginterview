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
        int sumLeft = 0;
        int sumRight = 0;
        int i = 0;
        int j = 0;
        int k = arr.get(0).size() - 1;
        while (i < arr.size()) {
            sumLeft += arr.get(i).get(j);
            sumRight += arr.get(i).get(k);
            j++;
            k--;
            i++;
        }
        return Math.abs(sumRight - sumLeft);
    }
}

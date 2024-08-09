package io.github.bluething.playground.codinginterview.hackerrank._1weekpreparationkit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class DiagonalDifferenceTest {
    @Test
    public void case01() {
        Assertions.assertEquals(15, diagonalDifference(List.of(List.of(11, 2, 4),
                List.of(4, 5, 6),
                List.of(10, 8, -12))));
    }

    private int diagonalDifference(List<List<Integer>> arr) {
        int sumLeft = 0, sumRight = 0;
        int left = 0, right = arr.get(0).size()-1;
        for (List<Integer> integers : arr) {
            sumLeft += integers.get(left++);
            sumRight += integers.get(right--);
        }
        return Math.abs(sumLeft - sumRight);
    }
}

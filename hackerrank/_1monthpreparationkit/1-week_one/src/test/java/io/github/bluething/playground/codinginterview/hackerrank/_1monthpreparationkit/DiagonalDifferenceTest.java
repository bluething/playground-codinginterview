package io.github.bluething.playground.codinginterview.hackerrank._1monthpreparationkit;

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
        int leftSum = 0;
        int rightSum = 0;
        int leftIndex = 0;
        int rightIndex = arr.size() - 1;
        for (int i = 0; i < arr.size(); i++) {
            leftSum += arr.get(i).get(leftIndex);
            rightSum += arr.get(i).get(rightIndex);
            leftIndex += 1;
            rightIndex -= 1;
        }

        return Math.abs(leftSum - rightSum);
    }
}

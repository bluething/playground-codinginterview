package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weekthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/three-month-preparation-kit-migratory-birds/problem
public class MigratoryBirdsTest {
    @Test
    public void case01() {
        Assertions.assertEquals(1, migratoryBirds(Arrays.asList(1, 1, 2, 2, 3)));
    }

    @Test
    public void case02() {
        Assertions.assertEquals(3, migratoryBirds(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
    }

    private int migratoryBirds(List<Integer> arr) {
        int[] typeCount = new int[5];
        for (Integer val : arr) {
            typeCount[val-1]++;
        }
        int max = 0;
        int typeId = 0;
        for (int i = 0; i < typeCount.length; i++) {
            if (typeCount[i] > max) {
                max = typeCount[i];
                typeId = i+1;
            }
        }


        return typeId;
    }
}

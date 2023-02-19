package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weekone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/three-month-preparation-kit-divisible-sum-pairs/problem
public class DivisibleSumPairsTest {

    @Test
    void case01() {
        Assertions.assertEquals(5, divisibleSumPairs(6, 3, Arrays.asList(1, 3, 2, 6, 1, 2)));
    }

    @Test
    void case02() {
        Assertions.assertEquals(5, divisibleSumPairs(6, 3, Arrays.asList(1, 3, 2, 6, 1, 2)));
    }

    private int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int numOfPair = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    numOfPair++;
                }
            }
        }
        return numOfPair;
    }
}

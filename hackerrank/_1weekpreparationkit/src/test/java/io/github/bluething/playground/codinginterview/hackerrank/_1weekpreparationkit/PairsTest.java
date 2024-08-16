package io.github.bluething.playground.codinginterview.hackerrank._1weekpreparationkit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class PairsTest {
    @Test
    void case01() {
        Assertions.assertEquals(3, pairs(2, Arrays.asList(1, 5, 3, 4, 2)));
    }
    private int pairs(int k, List<Integer> arr) {
        Set<Integer> set = new HashSet<>(arr);
        int count = 0;

        for (int num : arr) {
            if (set.contains(num + k)) {
                count++;
            }
        }

        return count;
    }
}

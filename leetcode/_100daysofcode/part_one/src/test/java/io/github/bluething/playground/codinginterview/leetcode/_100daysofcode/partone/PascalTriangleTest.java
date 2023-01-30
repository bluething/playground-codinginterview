package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// problem https://leetcode.com/problems/pascals-triangle/
public class PascalTriangleTest {

    @Test
    public void case01() {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1),
                Arrays.asList(1,1),
                Arrays.asList(1,2,3),
                Arrays.asList(1,3,3,1),
                Arrays.asList(1,4,6,4,1));
        Assertions.assertEquals(expected, generate(5));
    }

    private List<List<Integer>> generate(int numRows) {
        return Collections.emptyList();
    }
}

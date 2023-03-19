package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weekthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/three-month-preparation-kit-maximum-perimeter-triangle/problem
public class MaximumPerimeterTriangleTest {
    @Test
    public void case01() {
        Assertions.assertEquals(Arrays.asList(3, 4, 5), maximumPerimeterTriangle(Arrays.asList(1, 2, 3, 4, 5, 10)));
    }

    @Test
    public void case02() {
        Assertions.assertEquals(Arrays.asList(-1), maximumPerimeterTriangle(Arrays.asList(1, 2, 3)));
    }

    @Test
    public void case03() {
        Assertions.assertEquals(Arrays.asList(1000000000, 1000000000, 1000000000), maximumPerimeterTriangle(Arrays.asList(
                1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000,
                1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000,
                1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000,
                1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000,
                1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000,
                1000000000, 1000000000, 1000000000, 1000000000, 1000000000
        )));
    }

    private List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        return null;
    }
}

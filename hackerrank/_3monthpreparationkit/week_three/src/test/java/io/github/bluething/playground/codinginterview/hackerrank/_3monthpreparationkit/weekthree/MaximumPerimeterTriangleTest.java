package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weekthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
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

    // Non-degenerate triangle it is a triangle that has a positive area.
    // The condition for a non-degenerate triangle with sides a, b, c is
    // a + b > c
    // a + c > b
    // b + c > a
    // If a-b-c sorted desc, we just check if
    // c < b + a
    private List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        sticks.sort(Comparator.reverseOrder());
        for (int i = 0; i < sticks.size()-2; i++) {
            if (sticks.get(i) < sticks.get(i+1) + sticks.get(i+2)) {
                return List.of(sticks.get(i+2), sticks.get(i+1), sticks.get(i));
            }
        }
        return List.of(-1);
    }
}

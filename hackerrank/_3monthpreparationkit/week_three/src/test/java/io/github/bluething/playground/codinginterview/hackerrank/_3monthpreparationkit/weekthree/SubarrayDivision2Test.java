package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weekthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/three-month-preparation-kit-the-birthday-bar/problem
public class SubarrayDivision2Test {
    @Test
    public void case01() {
        Assertions.assertEquals(2, birthday(Arrays.asList(2, 2, 1, 3, 2), 4, 2));
    }

    @Test
    public void case02() {
        Assertions.assertEquals(1, birthday(Arrays.asList(4), 4, 1));
    }

    private int birthday(List<Integer> s, int d, int m) {
        return 0;
    }
}

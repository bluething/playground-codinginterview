package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weekthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

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
        int numOfChoice = 0;
        int sum = 0;
        int i = 0;
        int j = 0;
        while (i+m <= s.size()) {
            j = 0;
            sum = 0;
            while (j < m) {
                sum += s.get(i + j);
                j++;
            }
            if (sum == d) {
                numOfChoice++;
            }
            i++;
        }

        return numOfChoice;
    }
}

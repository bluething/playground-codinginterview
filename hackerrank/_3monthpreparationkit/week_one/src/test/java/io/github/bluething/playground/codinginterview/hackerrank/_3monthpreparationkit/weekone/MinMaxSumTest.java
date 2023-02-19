package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weekone;

import io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.ParentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/three-month-preparation-kit-mini-max-sum/problem
public class MinMaxSumTest extends ParentTest {

    @Test
    void case01() {
        miniMaxSum(Arrays.asList(1,3,5,7,9));
        Assertions.assertEquals("16 24", output.toString());
    }

    void case02() {
        miniMaxSum(Arrays.asList(1,2,3,4,5));
        Assertions.assertEquals("10 14", output.toString());
    }
    private void miniMaxSum(List<Integer> arr) {
        // Write your code here

    }
}

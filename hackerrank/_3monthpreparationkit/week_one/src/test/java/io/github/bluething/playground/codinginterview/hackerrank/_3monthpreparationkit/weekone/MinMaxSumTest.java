package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weekone;

import io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.ParentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// https://www.hackerrank.com/challenges/three-month-preparation-kit-mini-max-sum/problem
public class MinMaxSumTest extends ParentTest {

    @Test
    void case01() {
        miniMaxSum(Arrays.asList(1,3,5,7,9));
        Assertions.assertEquals("16 24", output.toString());
    }

    @Test
    void case02() {
        miniMaxSum(Arrays.asList(1,2,3,4,5));
        Assertions.assertEquals("10 14", output.toString());
    }

    @Test
    public void case03() {
        miniMaxSum2(Arrays.asList(1, 2, 3, 4, 5));
        Assertions.assertEquals("10 14", output.toString());
    }

    @Test
    public void case04() {
        miniMaxSum2(Arrays.asList(7, 69, 2, 221, 8974));
        Assertions.assertEquals("299 9271", output.toString());
    }

    private void miniMaxSum(List<Integer> arr) {
        arr.sort(Comparator.naturalOrder());
        long min = 0L;
        long max = 0L;
        for (int i = 0; i < arr.size()-1; i++) {
            min += arr.get(i);
            max += arr.get(i+1);
        }

        System.out.print(min + " " + max);
    }

    private void miniMaxSum2(List<Integer> arr) {
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        long sum = 0L;
        for (int arrVal : arr) {
            // find largest and smallest value
            min = Long.min(min, arrVal);
            max = Long.max(max, arrVal);
            sum += arrVal;
        }

        // just subtract max from sum to get min sum, vice versa
        System.out.print((sum-max) + " " + (sum-min));
    }
}

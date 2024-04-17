package io.github.bluething.playground.codinginterview.hackerrank._1monthpreparationkit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PlusMinusTest extends ParentTest {

    @Test
    public void case01() {
        plusMinus(Arrays.asList(-4, 3, -9, 0, 4, 1));
        Assertions.assertEquals("0.500000\n0.333333\n0.166667", output.toString());
    }

    private void plusMinus(List<Integer> arr) {
        float positiveRatio = 0f;
        float negativeRatio = 0f;
        float zeroRatio = 0f;

        for (Integer integer : arr) {
            if (integer > 0) {
                positiveRatio++;
            } else if (integer < 0) {
                negativeRatio++;
            } else {
                zeroRatio++;
            }
        }

        System.out.println(String.format("%6f", positiveRatio/arr.size()));
        System.out.println(String.format("%6f", negativeRatio/arr.size()));
        System.out.print(String.format("%6f", zeroRatio/arr.size()));

    }

}

package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weekone;

import io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.ParentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PlusMinusTest extends ParentTest {
    @Test
    public void case01() {
        plusMinus(Arrays.asList(-4, 3, -9, 0, 4, 1));
        Assertions.assertEquals("0.500000\n0.333333\n0.166667", output.toString());
    }

    private void plusMinus(List<Integer> arr) {
        float positiveRatio = 0f;
        float negativeRatio = 0f;
        float zeroRatio = 0f;
        int arrSize = arr.size();
        for (int value : arr) {
            if (value > 0) {
                positiveRatio++;
            } else if (value < 0) {
                negativeRatio++;
            } else {
                zeroRatio++;
            }
        }

        positiveRatio /= arrSize;
        negativeRatio /= arrSize;
        zeroRatio /= arrSize;

        System.out.println(String.format("%6f", positiveRatio));
        System.out.println(String.format("%6f", negativeRatio));
        System.out.println(String.format("%6f", zeroRatio));

    }
}

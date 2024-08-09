package io.github.bluething.playground.codinginterview.hackerrank._1weekpreparationkit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ZigZagSequenceTest extends ParentTest {
    @Test
    public void case01() {
        int[] input = new int[]{2, 3, 5, 1, 4};
        findZigZagSequence(input, 5);
        Assertions.assertArrayEquals(new int[]{1, 2, 5, 4, 3}, input);
    }

    @Test
    public void case02() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        findZigZagSequence(input, 7);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 7, 6, 5, 4}, input);
    }

    // Just sort the array then swap mid and tail.
    // Don't paste the code to hackerrank editor, need to edit in place.
    private void findZigZagSequence(int [] a, int n){
    }
}

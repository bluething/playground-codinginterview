package io.github.bluething.playground.codinginterview.hackerrank._1weekpreparationkit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Temp2Test {
    @Test
    void case01() {
        Assertions.assertEquals(3, solution(new int[]{2, 3, 4, 2, 3}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(4, solution(new int[]{2, 5, 6, 6, 4, 3, 4, 3, 1, 2, 4, 8, 4}));
    }
    int solution(int[] ices) {
        int[] left = new int[ices.length + 1];
        left[0] = 0;
        for (int i = 1; i < ices.length; i++) {
            left[i] = i == 1 ? ices[i-1] : Math.min(left[i-1], ices[i-1]);
        }
        int[] right = new int[ices.length + 1];
        right[ices.length] = 0;
        for (int i = ices.length-1; i >= 0; i--) {
            right[i] = i == ices.length-1 ? ices[i] : Math.min(right[i+1], ices[i]);
        }

        int count0 = 0;
        int countTime = 0;
        while (count0 < ices.length) {
            for (int i = 0; i < ices.length; i++) {
                if (left[i] == 0 || right[i+1] == 0) {
                    count0++;
                    ices[i] = -1;
                } else {
                    int max = Math.min(left[i], right[i+1]);
                    if (max == ices[i]) {
                        ices[i]--;
                    } else {
                        ices[i] = max;
                    }
                }
            }
            countTime++;
        }

        return countTime;
    }
}

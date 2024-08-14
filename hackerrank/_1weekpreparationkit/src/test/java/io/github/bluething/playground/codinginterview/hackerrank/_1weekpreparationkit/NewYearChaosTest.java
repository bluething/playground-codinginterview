package io.github.bluething.playground.codinginterview.hackerrank._1weekpreparationkit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class NewYearChaosTest extends ParentTest {
    @Test
    void case01() {
        minimumBribes(List.of(2, 1, 5, 3, 4));
        Assertions.assertEquals("3\n", output.toString());
    }
    @Test
    void case02() {
        minimumBribes(List.of(2, 5, 1, 3, 4));
        Assertions.assertEquals("Too chaotic\n", output.toString());
    }
    private void minimumBribes(List<Integer> q) {
        int minimumBribe = 0;
        int minimumRightValue1 = Integer.MAX_VALUE;
        int minimumRightValue2 = Integer.MAX_VALUE;
        for (int i = q.size()-1; i >= 0; i--) {
            int sticker = q.get(i);
            if (2 < sticker - i - 1) {
                System.out.println("Too chaotic");
                return;
            }
            if (sticker > minimumRightValue1) {
                minimumBribe++;
            }
            if (sticker > minimumRightValue2) {
                minimumBribe++;
            }
            if (sticker < minimumRightValue1 || sticker < minimumRightValue2) {
                if (minimumRightValue1 > minimumRightValue2) {
                    minimumRightValue1 = sticker;
                } else {
                    minimumRightValue2 = sticker;
                }
            }
        }

        System.out.println(minimumBribe);
    }
}

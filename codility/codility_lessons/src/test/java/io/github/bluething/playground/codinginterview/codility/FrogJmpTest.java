package io.github.bluething.playground.codinginterview.codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FrogJmpTest {
    @Test
    void case01() {
        Assertions.assertEquals(3, solution(10, 85, 30));
    }
    @Test
    void case02() {
        Assertions.assertEquals(0, solution(1, 1, 3));
    }
    private int solution(int X, int Y, int D) {
        int distance = Y - X;
        if (distance <= 0) {
            return 0;
        }

        return distance > D ? (int) Math.ceil((double) distance / D) : 1;
    }
}

package io.github.bluething.playground.codinginterview.codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PermMissingElemTest {
    @Test
    void case01() {
        Assertions.assertEquals(4, solution(new int[]{2,3,1,5}));
    }
    private int solution(int[] A) {
        if (A == null || A.length == 0) {
            return 1;
        }
        int n = A.length;
        long expectedSum = (long) (n + 1) * (n+2) / 2;
        long actualSum = 0;
        for (int a : A) {
            actualSum += a;
        }

        return (int) (expectedSum - actualSum);
    }
}

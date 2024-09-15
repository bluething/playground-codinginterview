package io.github.bluething.playground.codinginterview.codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OddOccurrencesInArrayTest {
    @Test
    void case01() {
        Assertions.assertEquals(7, solution(new int[]{9,3,9,3,9,7,9}));
    }
    private int solution(int[] A) {
        int result = 0;
        for (int a : A) {
            result ^= a;
        }

        return result;
    }
}

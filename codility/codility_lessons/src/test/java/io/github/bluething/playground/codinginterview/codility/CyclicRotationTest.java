package io.github.bluething.playground.codinginterview.codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CyclicRotationTest {
    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{9,7,6,3,8}, solution(new int[]{3,8,9,7,6}, 3));
    }
    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{0,0,0}, solution(new int[]{0,0,0}, 1));
    }
    @Test
    void case03() {
        Assertions.assertArrayEquals(new int[]{1,2,3,4}, solution(new int[]{1,2,3,4}, 4));
    }
    @Test
    void case04() {
        Assertions.assertArrayEquals(new int[]{9,7,6,3,8}, solution2(new int[]{3,8,9,7,6}, 3));
    }
    @Test
    void case05() {
        Assertions.assertArrayEquals(new int[]{0,0,0}, solution2(new int[]{0,0,0}, 1));
    }
    @Test
    void case06() {
        Assertions.assertArrayEquals(new int[]{1,2,3,4}, solution2(new int[]{1,2,3,4}, 4));
    }
    private int[] solution(int[] A, int K) {
        if (A.length == 0 || K == 0) {
            return A;
        }
        K %= A.length;
        for (int i = 1; i <= K; i++) {
            int last = A[A.length-1];
            for (int j = A.length-2; j >= 0 ; j--) {
                A[j+1] = A[j];
            }
            A[0] = last;
        }

        return A;
    }
    private int[] solution2(int[] A, int K) {
        if (A.length == 0 || K == 0) {
            return A;
        }
        K %= A.length;
        if (K == 0) {
            return A;
        }
        int[] result = new int[A.length];
        // move last k element to the beginning
        for (int i = 0; i < K; i++) {
            result[i] = A[A.length - K + i];
        }
        // move the first N-K (the rest of A) to the rest
        for (int i = 0; i < A.length-K; i++) {
            result[K+i] = A[i];
        }

        return result;
    }
}

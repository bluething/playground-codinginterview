package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weekthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DrawingBookTest {
    @Test
    public void case01() {
        Assertions.assertEquals(1, pageCount(5, 3));
    }

    @Test
    public void case02() {
        Assertions.assertEquals(0, pageCount(5, 4));
    }

    @Test
    public void case03() {
        Assertions.assertEquals(1, pageCount(6, 2));
    }

    @Test
    public void case04() {
        Assertions.assertEquals(1, pageCount(6, 5));
    }

    private int pageCount(int n, int p) {
        int numOfFlip = 0;
        if (p <= n/2) {
            for (int i = 1; i <= n/2; i += 2) {
                if (p == i-1 || p == i) {
                    break;
                }
                numOfFlip++;
            }
        } else {
            if (n % 2 == 0) {
                n += 1;
            }
            for (int i = n; i >= n/2; i -= 2) {
                if (p == i-1 || p == i) {
                    break;
                }
                numOfFlip++;
            }
        }

        return numOfFlip;
    }
}

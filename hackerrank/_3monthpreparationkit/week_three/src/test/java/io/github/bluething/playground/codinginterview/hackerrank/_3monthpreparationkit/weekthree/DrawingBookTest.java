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

    private int pageCount(int n, int p) {
        // Write your code here

    }
}

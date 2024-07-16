package io.github.bluething.playground.codinginterview.leetcode.binarysearch101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

class FindKClosestElementsTest {
    @Test
    void case01() {
        Assertions.assertEquals(List.of(1,2,3,4), findClosestElements(new int[]{1,2,3,4,5}, 4, 3));
    }
    @Test
    void case02() {
        Assertions.assertEquals(List.of(1,2,3,4), findClosestElements(new int[]{1,2,3,4,5}, 4, -1));
    }

    private List<Integer> findClosestElements(int[] arr, int k, int x) {
        return Collections.emptyList();
    }
}

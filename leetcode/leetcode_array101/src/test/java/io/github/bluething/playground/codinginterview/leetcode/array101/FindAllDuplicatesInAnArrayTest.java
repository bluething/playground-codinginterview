package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

class FindAllDuplicatesInAnArrayTest {
    @Test
    void case01() {
        Assertions.assertEquals(List.of(2,3), findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(List.of(1), findDuplicates(new int[]{1,1,2}));
    }
    @Test
    void case03() {
        Assertions.assertEquals(Collections.emptyList(), findDuplicates(new int[]{1}));
    }

    private List<Integer> findDuplicates(int[] nums) {
        return null;
    }
}

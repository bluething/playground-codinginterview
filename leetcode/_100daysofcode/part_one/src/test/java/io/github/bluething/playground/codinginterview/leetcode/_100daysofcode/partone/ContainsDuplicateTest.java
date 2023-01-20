package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// problem https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicateTest {

    @Test
    public void case01() {
        Assertions.assertTrue(containsDuplicate(new int[]{1,2,3,1}));
    }

    @Test
    public void case02() {
        Assertions.assertFalse(containsDuplicate(new int[]{1,2,3,4}));
    }

    @Test
    public void case03() {
        Assertions.assertTrue(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

    private boolean containsDuplicate(int[] nums) {
        boolean isDuplicate;

        return isDuplicate;
    }
}

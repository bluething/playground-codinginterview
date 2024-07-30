package io.github.bluething.playground.codinginterview.leetcode.hashtable101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

class ContainsDuplicateTest {
    @Test
    void case01() {
        Assertions.assertTrue(containsDuplicate(new int[]{1,2,3,1}));
    }
    @Test
    void case02() {
        Assertions.assertFalse(containsDuplicate(new int[]{1,2,3,4}));
    }
    @Test
    void case03() {
        Assertions.assertTrue(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

    private boolean containsDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (int num : nums) {
            if (!unique.add(num)) {
                return true;
            }
        }
        return false;
    }
}

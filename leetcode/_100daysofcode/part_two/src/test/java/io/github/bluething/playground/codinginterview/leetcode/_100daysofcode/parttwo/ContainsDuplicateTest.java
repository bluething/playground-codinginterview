package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.parttwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate/
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
        boolean isDuplicate = false;
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums) {
            if (!uniqueNums.add(num)) {
                isDuplicate = true;
                break;
            }
        }

        return isDuplicate;
    }
}

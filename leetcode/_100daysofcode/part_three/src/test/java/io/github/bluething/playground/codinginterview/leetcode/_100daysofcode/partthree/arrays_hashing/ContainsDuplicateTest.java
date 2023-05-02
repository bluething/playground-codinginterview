package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.arrays_hashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicateTest {
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

    @Test
    public void case04() {
        Assertions.assertTrue(containsDuplicate2(new int[]{1,2,3,1}));
    }

    @Test
    public void case05() {
        Assertions.assertFalse(containsDuplicate2(new int[]{1,2,3,4}));
    }

    @Test
    public void case06() {
        Assertions.assertTrue(containsDuplicate2(new int[]{1,1,1,3,3,4,3,2,4,2}));
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

    private boolean containsDuplicate2(int[] nums) {
        boolean isDuplicate = false;
        Map<Integer, Integer> uniqueCounter = new HashMap<>();
        for (int num : nums) {
            if (uniqueCounter.get(num) != null) {
                isDuplicate = true;
                break;
            } else {
                uniqueCounter.put(num, 1);
            }
        }

        return isDuplicate;
    }
}

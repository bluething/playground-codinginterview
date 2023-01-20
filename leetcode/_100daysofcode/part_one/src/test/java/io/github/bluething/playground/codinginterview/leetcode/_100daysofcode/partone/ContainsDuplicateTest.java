package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
        Set<Integer> uniques = new HashSet<>();
        for (int num : nums) {
            if (!uniques.add(num)) {
                isDuplicate = true;
                break;
            }
        }

        return isDuplicate;
    }

    private boolean containsDuplicate2(int[] nums) {
        boolean isDuplicate = false;
        Map<Integer, Integer> freqs = new HashMap<>();
        for (int num : nums) {
            if (freqs.get(num) != null) {
                isDuplicate = true;
                break;
            } else {
                freqs.put(num, 1);
            }
        }

        return isDuplicate;
    }
}

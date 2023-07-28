package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partfour.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150
class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void case01() {
        Assertions.assertEquals(2, removeDuplicates(new int[]{1,1,2}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(5, removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    private int removeDuplicates(int[] nums) {
        return 0;
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/remove-element/?envType=study-plan-v2&id=top-interview-150
class RemoveElementTest {

    @Test
    void case01() {
        Assertions.assertEquals(2, removeElement(new int[]{3,2,2,3}, 3));
    }

    @Test
    void case02() {
        Assertions.assertEquals(5, removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    private int removeElement(int[] nums, int val) {
        return 0;
    }
}

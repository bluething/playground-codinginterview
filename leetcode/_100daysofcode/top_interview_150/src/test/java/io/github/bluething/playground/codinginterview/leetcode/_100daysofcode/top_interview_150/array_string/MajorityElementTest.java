package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/majority-element/?envType=study-plan-v2&id=top-interview-150
class MajorityElementTest {
    @Test
    void case01() {
        Assertions.assertEquals(3, majorityElement(new int[]{3,2,3}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(2, majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    @Test
    void case03() {
        Assertions.assertEquals(3, majorityElement2(new int[]{3,2,3}));
    }

    @Test
    void case04() {
        Assertions.assertEquals(2, majorityElement2(new int[]{2,2,1,1,1,2,2}));
    }

    @Test
    void case05() {
        Assertions.assertEquals(3, majorityElement3(new int[]{3,2,3}));
    }

    @Test
    void case06() {
        Assertions.assertEquals(2, majorityElement3(new int[]{2,2,1,1,1,2,2}));
    }

    private int majorityElement(int[] nums) {
        return 0;
    }

    private int majorityElement2(int[] nums) {
        return 0;
    }

    private int majorityElement3(int[] nums) {
        return 0;
    }
}

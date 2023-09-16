package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partfour.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150
class MajorityElementTest {

    @Test
    void case01() {
        Assertions.assertEquals(3, majorityElement(new int[]{3,2,3}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(2, majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    private int majorityElement(int[] nums) {
        int counter = 0;
        int major = 0;
        for (int num : nums) {
            if (counter == 0) {
                major = num;
            }

            if (major == num) {
                counter++;
            } else {
                counter--;
            }
        }

        return major;
    }
}

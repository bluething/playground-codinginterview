package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MajorityElementTest {

    @Test
    public void case01() {
        Assertions.assertEquals(3, majorityElement(new int[]{3,2,3}));
    }

    @Test
    public void case02() {
        Assertions.assertEquals(2, majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    private int majorityElement(int[] nums) {
        return -1;
    }
}

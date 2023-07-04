package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/find-the-duplicate-number/
class FindTheDuplicateNumberTest {

    @Test
    void case01() {
        Assertions.assertEquals(2, findDuplicate(new int[]{1,3,4,2,2}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(3, findDuplicate(new int[]{3,1,3,4,2}));
    }

    private int findDuplicate(int[] nums) {
        return 0;
    }
}

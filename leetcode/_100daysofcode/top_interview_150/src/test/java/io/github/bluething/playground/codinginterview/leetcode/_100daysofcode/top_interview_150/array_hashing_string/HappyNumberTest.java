package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/happy-number/description/?envType=study-plan-v2&id=top-interview-150
class HappyNumberTest {

    @Test
    void case01() {
        Assertions.assertTrue(isHappy(19));
    }

    @Test
    void case02() {
        Assertions.assertFalse(isHappy(2));
    }

    private boolean isHappy(int n) {
        return true;
    }
}

package io.github.bluething.playground.codinginterview.leetcode.hashtable101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        return false;
    }
}

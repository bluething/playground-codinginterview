package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/count-number-of-texts/
class CountNumberOfTextsTest {

    @Test
    void case01() {
        Assertions.assertEquals(8, countTexts("22233"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(82876089, countTexts("222222222222222222222222222222222222"));
    }

    private int countTexts(String pressedKeys) {
        return 0;
    }
}

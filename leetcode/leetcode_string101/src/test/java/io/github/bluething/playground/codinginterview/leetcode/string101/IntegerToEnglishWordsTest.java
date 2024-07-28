package io.github.bluething.playground.codinginterview.leetcode.string101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntegerToEnglishWordsTest {
    @Test
    void case01() {
        Assertions.assertEquals("One Hundred Twenty Three", numberToWords(123));
    }
    @Test
    void case02() {
        Assertions.assertEquals("Twelve Thousand Three Hundred Forty Five", numberToWords(12345));
    }
    @Test
    void case03() {
        Assertions.assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven", numberToWords(1234567));
    }

    private String numberToWords(int num) {
        return "";
    }
}

package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weekone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://www.hackerrank.com/challenges/three-month-preparation-kit-time-conversion/problem
public class TimeConversionTest {

    @Test
    void case01() {
        Assertions.assertEquals("19:05:45", timeConversion("07:05:45PM"));
    }

    @Test
    void case02() {
        Assertions.assertEquals("12:01:00", timeConversion("12:01:00PM"));
    }

    @Test
    void case03() {
        Assertions.assertEquals("00:01:00", timeConversion("12:01:00AM"));
    }

    private String timeConversion(String s) {
        return "";
    }
}

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
        int hour = Integer.valueOf(s.substring(0, 2));
        int minute = Integer.valueOf(s.substring(3,5));
        int second = Integer.valueOf(s.substring(6,8));
        boolean isMidnight = s.substring(8,10).equals("AM") ? true : false;

        if (isMidnight) {
            hour = hour % 12;
        } else {
            hour = (hour % 12) + 12;
        }

        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}

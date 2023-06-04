package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/roman-to-integer/?envType=study-plan-v2&id=top-interview-150
class RomanToIntegerTest {

    @Test
    void case01() {
        Assertions.assertEquals(3, romanToInt("III"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(58, romanToInt("LVIII"));
    }

    @Test
    void case03() {
        Assertions.assertEquals(1994, romanToInt("MCMXCIV"));
    }

    private int romanToInt(String s) {
        int romanInt = 0;
        int prev = 0;
        int current = 0;
        for (char sChar : s.toCharArray()) {
            current = converter(sChar);
            romanInt += current;
            // case IV, IX, XL, XC, CD, Cm
            if (prev < current) {
                romanInt -= prev * 2;
            }
            prev = current;
        }

        return romanInt;
    }

    private int converter(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}

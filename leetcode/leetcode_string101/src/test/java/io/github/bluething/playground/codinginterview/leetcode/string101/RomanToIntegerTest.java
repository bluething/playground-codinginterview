package io.github.bluething.playground.codinginterview.leetcode.string101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

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
        Map<Character, Integer> romans = new HashMap<>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        int result = 0;
        int currentInt = 0, prevInt = 0;
        for (char c : s.toCharArray()) {
            currentInt = romans.get(c);
            result += currentInt;
            if (currentInt > prevInt) {
                result -= prevInt * 2;
            }
            prevInt = currentInt;
        }

        return result;
    }
}

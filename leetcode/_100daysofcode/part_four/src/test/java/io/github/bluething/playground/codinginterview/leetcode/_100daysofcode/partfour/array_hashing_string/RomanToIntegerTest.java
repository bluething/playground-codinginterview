package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partfour.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/roman-to-integer/?envType=study-plan-v2&envId=top-interview-150
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

        int romanInt = 0;
        int current = 0;
        int prev = 0;
        for (char roman : s.toCharArray()) {
            current = romans.get(roman);
            romanInt += current;
            if (current > prev) {
                romanInt -= prev * 2;
            }

            prev = current;
        }

        return romanInt;
    }
}

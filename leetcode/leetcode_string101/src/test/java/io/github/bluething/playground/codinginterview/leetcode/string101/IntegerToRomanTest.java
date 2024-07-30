package io.github.bluething.playground.codinginterview.leetcode.string101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntegerToRomanTest {
    @Test
    void case01() {
        Assertions.assertEquals("III", intToRoman(3));
    }

    @Test
    void case02() {
        Assertions.assertEquals("LVIII", intToRoman(58));
    }

    @Test
    void case03() {
        Assertions.assertEquals("MCMXCIV", intToRoman(1994));
    }
    @Test
    void case04() {
        Assertions.assertEquals("III", intToRoman2(3));
    }

    @Test
    void case05() {
        Assertions.assertEquals("LVIII", intToRoman2(58));
    }

    @Test
    void case06() {
        Assertions.assertEquals("MCMXCIV", intToRoman2(1994));
    }

    private String intToRoman(int num) {
        String[] M = {"", "M", "MM", "MMM"};
        String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return M[num / 1_000] + C[(num % 1_000) / 100] + X[(num % 100) / 10] + I[num % 10];
    }
    private String intToRoman2(int num) {
        int[] ints = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder result = new StringBuilder();

        int idx = 0;
        while (num > 0) {
            if (num >= ints[idx]) {
                result.append(romans[idx]);
                num -= ints[idx];
            } else {
                idx++;
            }
        }

        return result.toString();
    }
}

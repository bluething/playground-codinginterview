package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/integer-to-roman/description/
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

    // just subtract the num until 0
    // the key is we need to have a dictionary (int-roman) that order desc
    // here I use 2 array
    // if the num greater or equal dictionary[i] then subtract it
    //  we start from the biggest roman, 1000
    //  we move to the next roman if the num less than dictionary[i]
    private String intToRoman(int num) {
        int[] ints = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder("");

        int idx = 0;
        while (num > 0) {
            while (num >= ints[idx]) {
                num -= ints[idx];
                sb.append(romans[idx]);
            }

            idx++;
        }

        return sb.toString();
    }
}

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

    // we have constraint 1 <= num <= 3999
    //  so there are shortcut to solve this problem
    // what we do is we only need to find roman for thousands, hundreds, dozens and units part
    //  just use division and modulo operator
    // the key is we need to prepare mapping from to roman for all cases (not only base case)
    //  thousands => 1000 -> 3000
    //  hundreds => 100, 200, 300,.. -> 900
    //  dozens => 10, 20, 30,... -> 90
    //  units => 1, 2, 3.. => 9
    private String intToRoman2(int num) {
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }
}

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

    private static final String[] LESS_THAN_20 = new String[]{"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] TENS = new String[]{"", " Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static final String SPACE = " ";
    private String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        return helper(num);
    }
    private String helper(int num) {
        StringBuilder result = new StringBuilder();
        if (num < 20) {
            result.append(LESS_THAN_20[num]);
        } else if (num < 100) {
            result.append(TENS[num / 10]);
            if (num % 10 != 0) {
                result.append(SPACE).append(helper(num % 10));
            }
        } else if (num < 1000) {
            result.append(helper(num / 100)).append(" Hundred");
            if (num % 100 != 0) {
                result.append(SPACE).append(helper(num % 100));
            }
        } else if (num < 1_000_000) {
            result.append(helper(num / 1000)).append(" Thousand");
            if (num % 1000 != 0) {
                result.append(SPACE).append(helper(num % 1_000));
            }
        } else if (num < 1_000_000_000) {
            result.append(helper(num / 1_000_000)).append(" Million");
            if (num % 1_000_000 != 0) {
                result.append(SPACE).append(helper(num % 1_000_000));
            }
        } else {
            result.append(helper(num / 1_000_000_000)).append(" Billion");
            if (num % 1_000_000_000 != 0) {
                result.append(SPACE).append(helper(num % 1_000_000_000));
            }
        }

        return result.toString();
    }
}

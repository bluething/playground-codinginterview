package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindNumbersWithEvenNumberOfDigitsTest {
    @Test
    void case01() {
        Assertions.assertEquals(2, findNumbers(new int[]{12,345,2,6,7896}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(1, findNumbers(new int[]{555,901,482,1771}));
    }
    @Test
    void case03() {
        Assertions.assertEquals(2, findNumbers2(new int[]{12,345,2,6,7896}));
    }

    @Test
    void case04() {
        Assertions.assertEquals(1, findNumbers2(new int[]{555,901,482,1771}));
    }

    private int findNumbers(int[] nums) {
        int numOfEvenNumbers = 0;
        int digitCount = 0;
        for (int num : nums) {
            digitCount = String.valueOf(num).length();
            if (digitCount % 2 == 0) {
                numOfEvenNumbers++;
            }
        }

        return numOfEvenNumbers;
    }

    private int findNumbers2(int[] nums) {
        int numOfEvenNumbers = 0;
        for (int num : nums) {
            if (getDigitCount(num) % 2 == 0) {
                numOfEvenNumbers++;
            }
        }

        return numOfEvenNumbers;
    }
    private int getDigitCount(int num) {
        int digitCount = 0;
        while (num > 0) {
            num /= 10;
            digitCount++;
        }

        return digitCount;
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// problem https://leetcode.com/problems/plus-one/
public class PlusOneTest {

    @Test
    public void case01() {
        Assertions.assertArrayEquals(new int[]{1,2,4}, plusOne(new int[]{1,2,3}));
    }

    @Test
    public void case02() {
        Assertions.assertArrayEquals(new int[]{4,3,2,2}, plusOne(new int[]{4,3,2,1}));
    }
    @Test
    public void case03() {
        Assertions.assertArrayEquals(new int[]{1,0}, plusOne(new int[]{9}));
    }

    @Test
    public void case04() {
        Assertions.assertArrayEquals(new int[]{9,8,7,6,5,4,3,2,1,1}, plusOne(new int[]{9,8,7,6,5,4,3,2,1,0}));
    }

    @Test
    public void case05() {
        Assertions.assertArrayEquals(new int[]{6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,4}, plusOne(new int[]{6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3}));
    }

    private int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return new int[]{1};
        }

        // the logic is same when we manually add 1 into the number
        // start from last digit
        // if the digit was 9, means the result is 0 and we need to carry 1 to the left digit, the carry is always 1 because the addition is 1
        // otherwise just add the digit with 1, the result will be <= 9
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += carry;
                break;
            }
        }

        // this is the tricky part, what if we have digits with all 9 value?
        // we need to carry into the leftmost digit, means the addition result is 0
        // then we have carry value to the leftmost digit (the length of digits will increase by 1)
        if (digits[0] == 0) {
            int[] result = new int[digits.length+1];
            result[0] = carry;
            for (int i = 1; i < result.length; i++) {
                result[i] = digits[i-1];
            }
            return result;
        } else {
            return digits;
        }
    }
}

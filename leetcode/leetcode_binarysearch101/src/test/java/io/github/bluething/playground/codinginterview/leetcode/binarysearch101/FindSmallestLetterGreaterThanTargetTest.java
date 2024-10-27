package io.github.bluething.playground.codinginterview.leetcode.binarysearch101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindSmallestLetterGreaterThanTargetTest {
    @Test
    void case01() {
        Assertions.assertEquals('c', nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a'));
    }
    @Test
    void case02() {
        Assertions.assertEquals('f', nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c'));
    }
    @Test
    void case03() {
        Assertions.assertEquals('x', nextGreatestLetter(new char[]{'x', 'x', 'y', 'y'}, 'z'));
    }

    private char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;
        if (letters[left] > target || letters[right] <= target) {
            return letters[left];
        }

        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] > target) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return letters[right];
    }
}

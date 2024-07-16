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
        return '0';
    }
}

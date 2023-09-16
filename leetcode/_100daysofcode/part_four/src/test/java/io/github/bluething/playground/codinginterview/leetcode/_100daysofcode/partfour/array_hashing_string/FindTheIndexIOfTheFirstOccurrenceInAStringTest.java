package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partfour.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150
class FindTheIndexIOfTheFirstOccurrenceInAStringTest {

    @Test
    void case01() {
        Assertions.assertEquals(0, strStr("sadbutsad", "sad"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(-1, strStr("leetcode", "leeto"));
    }

    private int strStr(String haystack, String needle) {
        return 0;
    }
}

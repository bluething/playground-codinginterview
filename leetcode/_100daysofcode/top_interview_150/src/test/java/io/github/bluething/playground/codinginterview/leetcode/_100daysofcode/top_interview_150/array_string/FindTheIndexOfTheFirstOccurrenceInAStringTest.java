package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=study-plan-v2&id=top-interview-150
class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    @Test
    void case01() {
        Assertions.assertEquals(0, strStr("sadbutsad", "sad"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(-1, strStr("leetcode", "leeto"));
    }

    private int strStr(String haystack, String needle) {
        return -1;
    }
}

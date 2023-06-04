package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

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

    // sliding window of size needle.length
    private int strStr(String haystack, String needle) {
        for (int windowStart = 0; windowStart <= haystack.length() - needle.length(); windowStart++) {
            // for each char in needle, check if eq to haystack
            // start from the left of window until the end -> windowStart + i
            // break immediately if we find no equal char
            for (int i = 0; i < needle.length(); i++) {
                if (needle.charAt(i) != haystack.charAt(windowStart + i)) {
                    break;
                }
                // we find the answer if in the current window all char is equal
                if (i == needle.length() - 1) {
                    return windowStart;
                }
            }
        }

        return -1;
    }
}

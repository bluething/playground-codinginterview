package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partfour.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/longest-common-prefix/?envType=study-plan-v2&envId=top-interview-150
class LongestCommonPrefixTest {

    @Test
    void case01() {
        Assertions.assertEquals("fl", longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    @Test
    void case02() {
        Assertions.assertEquals("", longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    private String longestCommonPrefix(String[] strs) {
        return "";
    }
}

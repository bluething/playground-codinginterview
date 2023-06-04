package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/longest-common-prefix/description/?envType=study-plan-v2&id=top-interview-150
class LongestCommonPrefixTest {

    @Test
    void case01() {
        Assertions.assertEquals("fl", longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    @Test
    void case02() {
        Assertions.assertEquals("", longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    @Test
    void case03() {
        Assertions.assertEquals("fl", longestCommonPrefix2(new String[]{"flower","flow","flight"}));
    }

    @Test
    void case04() {
        Assertions.assertEquals("", longestCommonPrefix2(new String[]{"dog","racecar","car"}));
    }

    // assume 1st string was an LCP
    // for each next string check if the current string has a prefix equal to LCP
    // the key is, the LCP need to adjust by remove the last char until current string have a prefix of LCP
    private String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }

    // vertical scanning
    private String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                // loop as long as we see same char then we find the LCP when:
                // 1. we find sorter string than LCP
                // 2. or we find not equal char
                // then the LCP needs to return with the removal last char
                if (strs[j].length() == i || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }
}

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
}

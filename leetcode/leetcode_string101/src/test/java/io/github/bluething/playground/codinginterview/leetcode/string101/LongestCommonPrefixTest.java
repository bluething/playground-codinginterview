package io.github.bluething.playground.codinginterview.leetcode.string101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

    private String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || c != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
    private String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}

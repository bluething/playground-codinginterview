package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/longest-nice-substring/
class LongestNiceSubstringTest {

    @Test
    void case01() {
        Assertions.assertEquals("aAa", longestNiceSubstring("YazaAay"));
    }

    @Test
    void case02() {
        Assertions.assertEquals("Bb", longestNiceSubstring("Bb"));
    }

    @Test
    void case03() {
        Assertions.assertEquals("", longestNiceSubstring("C"));
    }

    private String longestNiceSubstring(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String tmp = s.substring(i,j);
                if (tmp.length() > 1
                && result.length() < tmp.length()
                && isNiceString(tmp)) {
                    result = tmp;
                }
            }
        }
        return result;
    }
    // get all unique char
    // in the set we must hava upper and lower pair for each char
    private boolean isNiceString(String s) {
        Set<Character> sUnique = new HashSet<>();
        for (char sChar : s.toCharArray()) {
            sUnique.add(sChar);
        }
        for (char sChar : sUnique) {
            if (sUnique.contains(Character.toUpperCase(sChar)) != sUnique.contains(Character.toLowerCase(sChar))) {
                return false;
            }
        }

        return true;
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    void case01() {
        Assertions.assertEquals(3, lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(1, lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void case03() {
        Assertions.assertEquals(3, lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void case04() {
        Assertions.assertEquals(0, lengthOfLongestSubstring(""));
    }

    @Test
    void case05() {
        Assertions.assertEquals(4, lengthOfLongestSubstring("dabcabcbb"));
    }

    @Test
    void case06() {
        Assertions.assertEquals(3, lengthOfLongestSubstring("abccabcbb"));
    }

    private int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int length = 0;
        char[] sChar = s.toCharArray();
        Set<Character> uniqueChar = new HashSet<>();
        for (int i = 0; i < sChar.length; i++) {
            uniqueChar = new HashSet<>();
            length = 0;
            for (int j = i; j < sChar.length; j++) {
                if (uniqueChar.add(sChar[j])) {
                    length += 1;
                } else {
                    break;
                }
            }
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}

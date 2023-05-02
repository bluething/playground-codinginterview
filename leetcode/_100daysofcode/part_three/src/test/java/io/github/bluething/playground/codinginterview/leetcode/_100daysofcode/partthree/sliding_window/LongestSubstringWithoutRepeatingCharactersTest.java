package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.sliding_window;

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

    @Test
    void case07() {
        Assertions.assertEquals(3, lengthOfLongestSubstring2("abcabcbb"));
    }

    @Test
    void case08() {
        Assertions.assertEquals(1, lengthOfLongestSubstring2("bbbbb"));
    }

    @Test
    void case09() {
        Assertions.assertEquals(3, lengthOfLongestSubstring2("pwwkew"));
    }

    @Test
    void case10() {
        Assertions.assertEquals(0, lengthOfLongestSubstring2(""));
    }

    @Test
    void case11() {
        Assertions.assertEquals(4, lengthOfLongestSubstring2("dabcabcbb"));
    }

    @Test
    void case12() {
        Assertions.assertEquals(3, lengthOfLongestSubstring2("abccabcbb"));
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

    private int lengthOfLongestSubstring2(String s) {
        int maxLength = 0;
        int start = 0;
        int end = 0;
        char sChar = (char) 0;
        Set<Character> uniqueChar = new HashSet<>();
        while (end < s.length()) {
            sChar = s.charAt(end);
            if (uniqueChar.add(sChar)) {
                maxLength = Math.max(end-start+1, maxLength);
                end++;
            } else {
                // If we find duplicate char then
                // We clean the uniqueChar set and move the start idx to the duplicate char
                // as long as the set contain duplicate char remove the char pointed by start idx
                // at the end of loop, start idx will point to the end idx
                // start and end idx is a slide window
                while (uniqueChar.contains(sChar)) {
                    uniqueChar.remove(s.charAt(start));
                    start++;
                }
            }
        }

        return maxLength;
    }
}

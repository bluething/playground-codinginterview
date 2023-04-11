package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/longest-repeating-character-replacement/
class LongestRepeatingCharacterReplacementTest {
    @Test
    void case01() {
        Assertions.assertEquals(4, characterReplacement("ABAB", 2));
    }

    @Test
    void case02() {
        Assertions.assertEquals(4, characterReplacement("AABABBA", 1));
    }

    private int characterReplacement(String s, int k) {
        int[] sCharFreq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int longestRepeatedChar = 0;
        for (int right = 0; right < s.length(); right++) {
            sCharFreq[s.charAt(right)-'A']++;
            maxFreq = Math.max(maxFreq, sCharFreq[s.charAt(right)-'A']);
            if ((right - left + 1) - maxFreq > k) {
                sCharFreq[s.charAt(left)-'A']--;
                left++;
            }

            longestRepeatedChar = Math.max(longestRepeatedChar, right-left+1);
        }
        return longestRepeatedChar;
    }
}

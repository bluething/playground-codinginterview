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

    // the key is we need to define a valid substring that the chars can be replaced at most k
    // to achieve that we need to have a counter, we need to know the most frequent char in current substring
    // so the longest valid substring can be defined by
    // window length - most frequent char <= k
    private int characterReplacement(String s, int k) {
        int[] sCharFreq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int longestRepeatedChar = 0;
        for (int right = 0; right < s.length(); right++) {
            sCharFreq[s.charAt(right)-'A']++;
            // no need to decrease the value
            // we will get the new longest substring when we meet a new maxFreq value
            // from this equation window length - most frequent char <= k
            // we will have longest substring if we can maximize window length
            // but we need to have max most frequent char also to keep the condition <= k
            maxFreq = Math.max(maxFreq, sCharFreq[s.charAt(right)-'A']);
            // maintain the window
            // we don't want to have a window that non-frequent char appear more that window length - k
            // because we have to replace it maximum as much k
            // if we reach the size, move the left pointer to the right
            // we need to decrease the freq char
            if ((right - left + 1) - maxFreq > k) {
                sCharFreq[s.charAt(left)-'A']--;
                left++;
            }

            longestRepeatedChar = Math.max(longestRepeatedChar, right-left+1);
        }
        return longestRepeatedChar;
    }
}

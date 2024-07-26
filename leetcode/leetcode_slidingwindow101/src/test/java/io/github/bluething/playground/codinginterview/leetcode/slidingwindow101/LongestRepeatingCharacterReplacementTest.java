package io.github.bluething.playground.codinginterview.leetcode.slidingwindow101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

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
        char[] chars = s.toCharArray();
        int left = 0, right = 0;
        int[] charCount = new int[26];
        int maxLength = 0, maxCount = 0;
        while (right < s.length()) {
            charCount[chars[right] - 'A']++;
            maxCount = Math.max(maxCount, charCount[chars[right] - 'A']);

            if (right - left + 1 - maxCount > k) {
                charCount[chars[left++] - 'A']--;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}

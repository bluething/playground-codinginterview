package io.github.bluething.playground.codinginterview.leetcode.slidingwindow101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

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
        int left = 0, right = 0;
        Map<Character, Integer> uniqueCounter = new HashMap<>();
        int maxLength = 0;
        while (right < s.length()) {
            uniqueCounter.put(s.charAt(right), uniqueCounter.getOrDefault(s.charAt(right), 0) + 1);
            while (uniqueCounter.size() != (right-left+1)) {
                uniqueCounter.put(s.charAt(left), uniqueCounter.get(s.charAt(left)) - 1);
                if (uniqueCounter.get(s.charAt(left)) == 0) {
                    uniqueCounter.remove(s.charAt(left));
                }
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
            right++;
        }

        return maxLength;
    }
}

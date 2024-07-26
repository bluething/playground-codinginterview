package io.github.bluething.playground.codinginterview.leetcode.slidingwindow101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringwithAtMostTwoDistinctCharactersTest {
    @Test
    void case01() {
        Assertions.assertEquals(3, lengthOfLongestSubstringTwoDistinct("eceba"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(5, lengthOfLongestSubstringTwoDistinct("ccaabbb"));
    }

    private int lengthOfLongestSubstringTwoDistinct(String s) {
        int left = 0, right = 0;
        Map<Character, Integer> uniqueCounter = new HashMap<>();
        int maxLength = 0;
        while (right < s.length()) {
            uniqueCounter.put(s.charAt(right), uniqueCounter.getOrDefault(s.charAt(right), 0) + 1);
            while (uniqueCounter.size() > 2) {
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

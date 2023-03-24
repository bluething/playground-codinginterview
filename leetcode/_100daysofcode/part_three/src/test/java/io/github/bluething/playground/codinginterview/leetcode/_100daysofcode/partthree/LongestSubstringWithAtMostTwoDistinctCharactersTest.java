package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

// https://aaronice.gitbook.io/lintcode/two_pointers/longest-substring-with-at-most-two-distinct-characters
class LongestSubstringWithAtMostTwoDistinctCharactersTest {
    @Test
    void case01() {
        Assertions.assertEquals(3, lengthOfLongestSubstringTwoDistinct("eceba"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(5, lengthOfLongestSubstringTwoDistinct("ccaabbb"));
    }

    private int lengthOfLongestSubstringTwoDistinct(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        char[] sChars = s.toCharArray();
        Map<Character, Integer> charFreq = new HashMap<>();
        int leftIdx = 0;
        int longest = 0;
        for (int i = 0; i < s.length(); i++) {
            charFreq.put(sChars[i], charFreq.getOrDefault(sChars[i], 0) + 1);
            // find 1st char with single occurrences in the window
            // the position (leftIdx) is the candidate for 1st char in our longest substring
            while (charFreq.size() > 2) {
                charFreq.put(sChars[leftIdx], charFreq.get(sChars[leftIdx]) -1);
                if (charFreq.get(sChars[leftIdx]) == 0) {
                    charFreq.remove(sChars[leftIdx]);
                }
                leftIdx++;
            }
            longest = Math.max(longest, i - leftIdx + 1);
        }
        return longest;
    }
}

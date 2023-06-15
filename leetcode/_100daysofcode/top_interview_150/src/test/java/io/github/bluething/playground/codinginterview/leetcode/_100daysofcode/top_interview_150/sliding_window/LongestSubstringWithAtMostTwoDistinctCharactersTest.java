package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.sliding_window;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters/description/
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

    // using map as a sliding window
    private int lengthOfLongestSubstringTwoDistinct(String s) {
        int longest = 0;
        Map<Character, Integer> freqMap = new HashMap<>();
        int leftIdx = 0;
        for (int i = 0; i < s.length(); i++) {
            freqMap.put(s.charAt(i), freqMap.getOrDefault(s.charAt(i), 0) + 1);

            // maintain the window <= 2
            // when the window size > 2 then we need to shrink it into 2 again
            // we delete the element in map when the freq is 0
            // the leftIdx will point to the char that need to delete
            // when the window size back to 2, the leftIdx will point to the 2nd unique char
            while (freqMap.size() > 2) {
                freqMap.put(s.charAt(leftIdx), freqMap.get(s.charAt(leftIdx))-1);
                if (freqMap.get(s.charAt(leftIdx)) == 0) {
                    freqMap.remove(s.charAt(leftIdx));
                }
                leftIdx++;
            }

            longest = Math.max(longest, i - leftIdx + 1);
        }
        return longest;
    }
}

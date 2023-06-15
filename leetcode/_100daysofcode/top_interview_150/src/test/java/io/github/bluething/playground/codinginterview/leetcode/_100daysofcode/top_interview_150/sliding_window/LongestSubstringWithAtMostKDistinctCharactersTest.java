package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.sliding_window;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/description/
// https://www.lintcode.com/problem/386/
class LongestSubstringWithAtMostKDistinctCharactersTest {

    @Test
    void case01() {
        Assertions.assertEquals(4, lengthOfLongestSubstringKDistinct("eceba", 3));
    }

    @Test
    void case02() {
        Assertions.assertEquals(4, lengthOfLongestSubstringKDistinct("WORLD", 4));
    }

    @Test
    void case03() {
        Assertions.assertEquals(7, lengthOfLongestSubstringKDistinct("abbbbbbc", 2));
    }

    private int lengthOfLongestSubstringKDistinct(String s, int k) {
        int longest = 0;
        Map<Character, Integer> freqMap = new HashMap<>();
        int leftIdx = 0;
        for (int i = 0; i < s.length(); i++) {
            freqMap.put(s.charAt(i), freqMap.getOrDefault(s.charAt(i), 0) + 1);

            // maintain the window <= k
            // when the window size > k then we need to shrink it into k again
            // we delete the element in map when the freq is 0
            // the leftIdx will point to the char that need to delete
            // when the window size back to k, the leftIdx will point to the 2nd unique char
            while (freqMap.size() > k) {
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

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.sliding_window;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/?envType=study-plan-v2&envId=top-interview-150
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

    // using Set as a sliding window
    // keep add to the Set and calculate maxLength
    // when find duplicate we remove element from Set start from the left until meet the duplicate char
    // also increment the start index, so the new index pointing to the next non duplicate char
    private int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        int end = 0;
        Set<Character> windows = new HashSet<>();
        char current = (char) 0;
        while (end < s.length()) {
            current = s.charAt(end);
            if (windows.add(current)) {
                maxLength = Math.max(maxLength, windows.size());
                end++;
            } else {
                while (windows.contains(current)) {
                    windows.remove(s.charAt(start));
                    start++;
                }
            }
        }

        return maxLength;
    }
}

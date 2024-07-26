package io.github.bluething.playground.codinginterview.leetcode.slidingwindow101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumWindowSubstringTest {
    @Test
    void case01() {
        Assertions.assertEquals("BANC", minWindow("ADOBECODEBANC", "ABC"));
    }
    @Test
    void case02() {
        Assertions.assertEquals("a", minWindow("a", "a"));
    }
    @Test
    void case03() {
        Assertions.assertEquals("", minWindow("a", "aa"));
    }
    private String minWindow(String s, String t) {
        int[] arr = new int[128];
        char[] tChar = t.toCharArray();
        for (char c : tChar) {
            arr[c]++;
        }
        char[] sChar = s.toCharArray();
        int left = 0, right = 0;
        int minLength = Integer.MAX_VALUE;
        int counter = 0;
        String ans = "";
        while (right < s.length()) {
            char c = sChar[right];
            if (--arr[c] >= 0) {
                counter++;
            }
            while (counter == t.length()) {
                int currLength = right - left + 1;
                if (currLength < minLength) {
                    minLength = currLength;
                    ans = s.substring(left, right+1);
                }
                char leftChar = sChar[left];
                if (++arr[leftChar] > 0) {
                    counter--;
                }
                left++;
            }

            right++;
        }
        return ans;
    }
}

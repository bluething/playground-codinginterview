package io.github.bluething.playground.codinginterview.leetcode.slidingwindow101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PermutationinStringTest {
    @Test
    void case01() {
        Assertions.assertTrue(checkInclusion("ab", "eidbaooo"));
    }
    @Test
    void case02() {
        Assertions.assertFalse(checkInclusion("ab", "eidboaoo"));
    }
    private boolean checkInclusion(String s1, String s2) {
        int[] arr = new int[128];
        int left = 0, right = 0;
        char[] s1Chars = s1.toCharArray();
        for (char c : s1Chars) {
            arr[c]++;
        }
        char[] s2Chars = s2.toCharArray();
        int minLength = Integer.MAX_VALUE;
        int counter = 0;
        while (right < s2.length()) {
            char c = s2Chars[right];
            if (--arr[c] >= 0) {
                counter++;
            }
            while (counter == s1.length()) {
                int currLength = right - left + 1;
                minLength = Math.min(minLength, currLength);
                char leftChar = s2Chars[left];
                if (++arr[leftChar] > 0) {
                    counter--;
                }
                left++;
            }

            right++;
        }
        return minLength == s1.length();
    }
}

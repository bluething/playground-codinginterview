package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/permutation-in-string/
class PermutationInStringTest {

    @Test
    void case01() {
        Assertions.assertTrue(checkInclusion("ab", "eidbaooo"));
    }

    @Test
    void case02() {
        Assertions.assertFalse(checkInclusion("ab", "eidboaoo"));
    }

    private boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] freqChar = new int[26];
        int[] freqCharS2 = new int[26];
        // init the frequency with size s1
        for (int i = 0; i < s1.length(); i++) {
            freqChar[s1.charAt(i)-97]++;
            freqCharS2[s2.charAt(i)-97]++;
        }

        // sliding window with size s1.length
        // left = i
        // right = i + s1.length()
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (isMatch(freqChar, freqCharS2)) {
                return true;
            }

            // increase the rightmost window for the next comparison
            freqCharS2[s2.charAt(i+s1.length()) - 97]++;
            // decrease the leftmost window for the next comparison
            // we don't want to see the value for the next comparison
            freqCharS2[s2.charAt(i) - 97]--;
        }

        return isMatch(freqChar, freqCharS2);
    }

    private boolean isMatch(int[] freqChar, int[] freqCharS2) {
        for (int i = 0; i < 26; i++) {
            if (freqChar[i] != freqCharS2[i]) {
                return false;
            }
        }

        return true;
    }
}
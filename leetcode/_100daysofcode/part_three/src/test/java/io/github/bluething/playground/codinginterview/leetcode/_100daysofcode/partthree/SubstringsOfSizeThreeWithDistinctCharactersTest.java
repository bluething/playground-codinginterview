package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
class SubstringsOfSizeThreeWithDistinctCharactersTest {

    @Test
    void case01() {
        Assertions.assertEquals(1, countGoodSubstrings("xyzzaz"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(4, countGoodSubstrings("aababcabc"));
    }

    private int countGoodSubstrings(String s) {
        int[] freq = new int[128];
        int repeat = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                repeat++;
            }
            freq[s.charAt(i)]++;
            // keep the window size (3)
            // start from 4th position
            // we must check if the 1st position hava 2 freq
            // if yes, decrement by 1
            // we don't allow inside the window have freq=2 (repeat)
            if (i >= 3) {
                if (freq[s.charAt(i-3)] == 2) {
                    repeat--;
                }
                freq[s.charAt(i-3)]--;
            }
            // inside the window
            // check if we have repeated char
            if (i >= 2 && repeat == 0) {
                result++;
            }
        }
        return result;
    }
}

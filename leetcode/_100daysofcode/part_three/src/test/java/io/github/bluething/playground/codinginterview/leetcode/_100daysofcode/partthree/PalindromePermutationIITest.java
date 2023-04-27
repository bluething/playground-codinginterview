package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class PalindromePermutationIITest {
    @Test
    void case01() {
        Assertions.assertEquals(Arrays.asList("baab", "abba"), generatePalindromes("aabb"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(Collections.emptyList(), generatePalindromes("abc"));
    }

    // palindrome -> there are always paired char or at least one unique char
    // paired char -> freq %2 == 0
    // after we have freq map, we need to make sure there are only one unique char
    private List<String> generatePalindromes(String s) {
        int[] freqChar = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freqChar[s.charAt(i)]++;
        }

        List<String> result = new ArrayList<>();
        boolean isOdd = false;
        int oddIdx = 0;
        for (int i = 0; i < freqChar.length; i++) {
            if (freqChar[i] % 2 == 1) {
                if (isOdd) {
                    return result;
                }
                oddIdx = i;
                isOdd = true;
            }
        }

        // put unique char as a base (become a center)
        String base = "";
        if (isOdd) {
            base = (char)oddIdx + "";
            freqChar[oddIdx]--;
        }

        backtracking(result, base, freqChar, s.length());

        return result;
    }

    private void backtracking(List<String> result, String base, int[] freqChar, int length) {
        if (base.length() == length) {
            result.add(base);
            return;
        }
        for (int i = 0; i < freqChar.length; i++) {
            if (freqChar[i] > 0) {
                freqChar[i] -= 2;
                // (char)i + base + (char)i
                // add non-unique char in left and right
                // we expand the string for the next recursion stack
                backtracking(result, (char)i + base + (char)i, freqChar, length);
                freqChar[i] += 2;
            }
        }
    }
}

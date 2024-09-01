package io.github.bluething.playground.codinginterview.coderbyte.coderbyte101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinWindowSubstringTest {
    @Test
    void case01() {
        Assertions.assertEquals("aksfaje", MinWindowSubstring(new String[]{"ahffaksfajeeubsne", "jefaa"}));
    }
    @Test
    void case02() {
        Assertions.assertEquals("affhkkse", MinWindowSubstring(new String[]{"aaffhkksemckelloe", "fhea"}));
    }
    private String MinWindowSubstring(String[] strArr) {
        int[] freqChar = new int[256];
        for (char c : strArr[1].toCharArray()) {
            freqChar[c]++;
        }
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int count = 0;
        String ans = "";
        while (right < strArr[0].length()) {
            char currChar = strArr[0].charAt(right);
            if (--freqChar[currChar] >= 0) {
                count++;
            }
            while (count == strArr[1].length()) {
                int curLen = right - left + 1;
                if (curLen < minLen) {
                    minLen = curLen;
                    ans = strArr[0].substring(left, right+1);
                }
                char leftChar = strArr[0].charAt(left);
                if (++freqChar[leftChar] > 0) {
                    count--;
                }
                left++;
            }
            right++;
        }
        return ans;
    }
}

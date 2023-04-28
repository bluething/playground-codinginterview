package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

// https://leetcode.com/problems/decode-ways/
class DecodeWaysTest {

    @Test
    void case01() {
        Assertions.assertEquals(2, numDecodings("12"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(3, numDecodings("226"));
    }

    @Test
    void case03() {
        Assertions.assertEquals(0, numDecodings("06"));
    }

    @Test
    void case04() {
        Assertions.assertEquals(2, numDecodings2("12"));
    }

    @Test
    void case05() {
        Assertions.assertEquals(3, numDecodings2("226"));
    }

    @Test
    void case06() {
        Assertions.assertEquals(0, numDecodings2("06"));
    }

    @Test
    void case07() {
        Assertions.assertEquals(2, numDecodingsDp("12"));
    }

    @Test
    void case08() {
        Assertions.assertEquals(3, numDecodingsDp("226"));
    }

    @Test
    void case09() {
        Assertions.assertEquals(0, numDecodingsDp("06"));
    }

    @Test
    void case10() {
        Assertions.assertEquals(2, numDecodingsDpWithConstantSpace("12"));
    }

    @Test
    void case11() {
        Assertions.assertEquals(3, numDecodingsDpWithConstantSpace("226"));
    }

    @Test
    void case12() {
        Assertions.assertEquals(0, numDecodingsDpWithConstantSpace("06"));
    }

    private int numDecodings(String s) {
        return numDecodingsRec(s, 0);
    }
    private int numDecodingsRec(String s, int idx) {
        if (idx == s.length()) {
            return 1;
        }
        if (s.charAt(idx) == '0') {
            return 0;
        }
        int count = numDecodingsRec(s, idx+1);
        if (idx < s.length()-1 && ((s.charAt(idx)-'0') * 10 + (s.charAt(idx+1)-'0')) < 27) {
            count += numDecodingsRec(s, idx+2);
        }

        return count;
    }

    private int numDecodings2(String s) {
        int[] mem = new int[s.length()];
        Arrays.fill(mem, -1);
        return numDecodingsRecMemo(s, 0, mem);
    }
    private int numDecodingsRecMemo(String s, int idx, int[] mem) {
        if (idx == s.length()) {
            return 1;
        }
        if (s.charAt(idx) == '0') {
            return 0;
        }
        if (mem[idx] != -1) {
            return mem[idx];
        }
        int count = numDecodingsRecMemo(s, idx+1, mem);
        if (idx < s.length()-1 && ((s.charAt(idx)-'0') * 10 + (s.charAt(idx+1)-'0')) < 27) {
            count += numDecodingsRecMemo(s, idx+2, mem);
        }

        return mem[idx] = count;
    }

    private int numDecodingsDp(String s) {
        int[] dp = new int[s.length()+1];
        dp[s.length()] = 1;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) != '0') {
                dp[i] = dp[i+1];
                if (i < s.length()-1
                        && (s.charAt(i)=='1'|| s.charAt(i)=='2' && s.charAt(i+1) < '7')) {
                    dp[i] += dp[i+2];
                }
            }
        }
        return dp[0];
    }

    private int numDecodingsDpWithConstantSpace(String s) {
        int dp1 = 1;
        int dp2 = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            int dp = s.charAt(i) == '0' ? 0 : dp1;
            if (i < s.length()-1
                    && (s.charAt(i)=='1'|| s.charAt(i)=='2' && s.charAt(i+1) < '7')) {
                dp += dp2;
            }
            dp2 = dp1;
            dp1 = dp;
        }

        return dp1;
    }
}

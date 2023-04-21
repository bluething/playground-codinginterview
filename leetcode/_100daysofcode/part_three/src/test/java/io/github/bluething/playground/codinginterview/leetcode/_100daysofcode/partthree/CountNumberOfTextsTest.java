package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/count-number-of-texts/
class CountNumberOfTextsTest {

    @Test
    void case01() {
        Assertions.assertEquals(8, countTexts("22233"));
    }

    @Test
    void case02() {
        Assertions.assertEquals(82876089, countTexts("222222222222222222222222222222222222"));
    }

    private int countTexts(String pressedKeys) {
        int[] memo = new int[pressedKeys.length()];

        return dfs(pressedKeys, memo, 0);
    }

    // the key is how many ways to interpret the prefix
    private int dfs(String pressedKeys, int[] memo, int idx) {
        // end of string, we only hava one permutation
        if (idx == pressedKeys.length()) {
            return 1;
        }
        if (memo[idx] != 0) {
            return memo[idx];
        }

        int count=0;
        // the maximum prefix length that we can have is 4 (for digit 7 and 9)
        for (int i=0; i<4; i++) {
            // when the prefix length is 4, make sure we only process digit 7 or 9
            if (pressedKeys.charAt(idx) != '7' && pressedKeys.charAt(idx) != '9' && i == 3) {
                break;
            }
            // to avoid index out of bound
            if (idx+i >= pressedKeys.length()) {
                break;
            }
            // make sure the prefix have same char
            // 222 can be interpreted as
            // aaa
            // ba
            // c
            if (i != 0) {
                if (pressedKeys.charAt(idx+i) != pressedKeys.charAt(idx+i-1)) {
                    break;
                }
            }

            // go to the right char after prefix
            count += dfs(pressedKeys, memo, idx+i+1);
            count %= 1000000007;
        }

        memo[idx] = count;
        return count;
    }
}

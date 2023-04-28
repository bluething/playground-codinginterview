package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

// https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/description/
class MinimumNumberOfSwapsToMakeTheStringBalancedTest {

    @Test
    void case01() {
        Assertions.assertEquals(1, minSwaps("][]["));
    }

    @Test
    void case02() {
        Assertions.assertEquals(2, minSwaps("]]][[["));
    }

    @Test
    void case03() {
        Assertions.assertEquals(0, minSwaps("[]"));
    }

    @Test
    void case04() {
        Assertions.assertEquals(1, minSwaps2("][]["));
    }

    @Test
    void case05() {
        Assertions.assertEquals(2, minSwaps2("]]][[["));
    }

    @Test
    void case06() {
        Assertions.assertEquals(0, minSwaps2("[]"));
    }

    // keep track of unbalance close
    // each swap will reduce unbalance close by 2
    // ] ] ] [ [ [ [ ]
    // 0 1 2 3 4 5 6 7
    // we have 3 unbalance close 0-1-2
    // we can swap 3 times 0->3 1->4 2->5
    // but for minimum swap, we only need to swap 0-6 and 1-5 (2 swap)
    // [ [ ] [ [ ] ] ] => balance
    private int minSwaps(String s) {
        Stack<Character> brackets = new Stack<>();
        int unbalance = 0;
        for (char c : s.toCharArray()) {
            if (c == '[') {
                brackets.push(c);
            } else {
                if (brackets.isEmpty()) {
                    unbalance++;
                } else {
                    brackets.pop();
                }
            }
        }
        return (unbalance+1) / 2;
    }

    private int minSwaps2(String s) {
        int unbalance = 0;
        int close = 0;
        for (char c : s.toCharArray()) {
            if (c == '[') {
                close--;
            } else {
                close++;
            }
            unbalance = Math.max(close, unbalance);
        }

        return (unbalance+1) / 2;
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&id=top-interview-150
class BestTimeToBuyAndSellStockTest {

    @Test
    void case01() {
        Assertions.assertEquals(5, maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(0, maxProfit(new int[]{7,6,4,3,1}));
    }

    private int maxProfit(int[] prices) {
        int provit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            provit = Math.max(provit, prices[i] - buy);
        }

        return provit;
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/?envType=study-plan-v2&envId=top-interview-150
class BestTimeToBuyAndSellStockIITest {

    @Test
    void case01() {
        Assertions.assertEquals(7, maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(4, maxProfit(new int[]{1,2,3,4,5}));
    }

    @Test
    void case03() {
        Assertions.assertEquals(0, maxProfit(new int[]{7,6,4,3,1}));
    }

    // the key is we visualize stock prices in cartesian diagram, price vs day
    // when the chart goes uphill means we have buy-sel pair
    private int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}

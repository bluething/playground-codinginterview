package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSellStockTest {
    @Test
    public void case01() {
        Assertions.assertEquals(5, maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void case02() {
        Assertions.assertEquals(0, maxProfit(new int[]{7,6,4,3,1}));
    }

    private int maxProfit(int[] prices) {
        int provit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            provit = Math.max(provit, prices[i]-buy);
            buy = Math.min(buy, prices[i]);
        }

        return provit;
    }
}

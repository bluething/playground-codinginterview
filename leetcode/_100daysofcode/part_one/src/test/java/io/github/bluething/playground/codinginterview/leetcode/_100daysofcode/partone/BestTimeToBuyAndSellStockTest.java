package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// problem https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
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
        int buying = prices[0];
        for (int i = 1; i < prices.length; i++) {
            // find if we want to buy or sell
            // if sell, calculate the max provit
            if (prices[i] < buying) {
                buying = prices[i];
            } else {
                provit = Math.max(provit, prices[i] - buying);
            }
        }

        return provit;
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.parttwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSellStockTest {

    @Test
    void case01() {
        Assertions.assertEquals(5, maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(0, maxProfit(new int[]{7,6,4,3,1}));
    }

    @Test
    void case03() {
        Assertions.assertEquals(5, maxProfit2(new int[]{7,1,5,3,6,4}));
    }

    @Test
    void case04() {
        Assertions.assertEquals(0, maxProfit2(new int[]{7,6,4,3,1}));
    }

    private int maxProfit(int[] prices) {
        int provit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else {
                provit = Math.max(provit, prices[i] - buy);
            }
        }

        return provit;
    }

    private int maxProfit2(int[] prices) {
        int provit = 0;
        int buy = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            provit = Math.max(provit, prices[i] - buy);
            buy = Math.min(buy, prices[i]);
        }

        return provit;
    }
}

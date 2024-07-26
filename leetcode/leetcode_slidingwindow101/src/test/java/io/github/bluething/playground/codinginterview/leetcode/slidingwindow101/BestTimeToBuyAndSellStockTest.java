package io.github.bluething.playground.codinginterview.leetcode.slidingwindow101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockTest {
    @Test
    public void case01() {
        Assertions.assertEquals(5, maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void case02() {
        Assertions.assertEquals(0, maxProfit(new int[]{7,6,4,3,1}));
    }

    private int maxProfit(int[] prices) {
        int left = 0, right = 1;
        int provit = 0, maxProfit = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                provit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, provit);
            } else {
                left = right;
            }
            right++;
        }

        return maxProfit;
    }
}

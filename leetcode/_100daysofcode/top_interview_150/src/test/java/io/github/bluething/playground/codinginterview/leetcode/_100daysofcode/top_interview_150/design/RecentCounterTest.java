package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RecentCounterTest {

    @Test
    void case01() {
        RecentCounter recentCounter = new RecentCounter();
        Assertions.assertEquals(1, recentCounter.ping(1));
        Assertions.assertEquals(2, recentCounter.ping(100));
        Assertions.assertEquals(3, recentCounter.ping(3001));
        Assertions.assertEquals(3, recentCounter.ping(3002));
    }


    class RecentCounter {

        public RecentCounter() {

        }

        public int ping(int t) {

        }
    }
}

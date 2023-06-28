package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

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

        // fifo operation
        private final Queue<Integer> queue;

        public RecentCounter() {
            queue = new LinkedList<>();
        }

        public int ping(int t) {
            queue.add(t);
            // keep the sliding window start from t-3000
            while (queue.peek() < t-3000) {
                queue.poll();
            }
            return queue.size();
        }
    }
}

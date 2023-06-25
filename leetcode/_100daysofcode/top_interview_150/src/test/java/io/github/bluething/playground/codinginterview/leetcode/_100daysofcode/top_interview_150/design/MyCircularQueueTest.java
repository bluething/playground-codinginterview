package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/design-circular-queue/description/
class MyCircularQueueTest {

    @Test
    void case01() {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        Assertions.assertTrue(myCircularQueue.enQueue(1));
        Assertions.assertTrue(myCircularQueue.enQueue(2));
        Assertions.assertTrue(myCircularQueue.enQueue(3));
        Assertions.assertFalse(myCircularQueue.enQueue(4));
        Assertions.assertEquals(3, myCircularQueue.Rear());
        Assertions.assertTrue(myCircularQueue.isFull());
        Assertions.assertTrue(myCircularQueue.deQueue());
        Assertions.assertTrue(myCircularQueue.enQueue(4));
        Assertions.assertEquals(4, myCircularQueue.Rear());
    }

    class MyCircularQueue {

        public MyCircularQueue(int k) {

        }

        public boolean enQueue(int value) {
            return true;
        }

        public boolean deQueue() {
            return true;
        }

        public int Front() {
            return 0;
        }

        public int Rear() {
            return 0;
        }

        public boolean isEmpty() {
            return true;
        }

        public boolean isFull() {
            return true;
        }
    }
}

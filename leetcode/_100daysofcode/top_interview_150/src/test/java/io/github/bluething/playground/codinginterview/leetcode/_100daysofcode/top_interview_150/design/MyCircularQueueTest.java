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

    @Test
    void case02() {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        Assertions.assertTrue(myCircularQueue.enQueue(2));
        Assertions.assertEquals(2, myCircularQueue.Rear());
        Assertions.assertEquals(2, myCircularQueue.Front());
        Assertions.assertTrue(myCircularQueue.deQueue());
        Assertions.assertEquals(-1, myCircularQueue.Front());
        Assertions.assertFalse(myCircularQueue.deQueue());
        Assertions.assertEquals(-1, myCircularQueue.Front());
        Assertions.assertTrue(myCircularQueue.enQueue(4));
        Assertions.assertTrue(myCircularQueue.enQueue(2));
        Assertions.assertTrue(myCircularQueue.enQueue(2));
        Assertions.assertFalse(myCircularQueue.enQueue(3));
    }

    // using an array with size k as data structure
    // the tricky part is when we initialize the idxTail
    // we can't use 0 because the idxTail will point to the next index and when we insert at the end of the queue then idxTail will point to the 1st index
    // so we use -1 (dummy index)
    class MyCircularQueue {

        private final int[] queue;
        private int idxHead;
        private int idxTail;
        private final int capacity;
        private int size;

        public MyCircularQueue(int k) {
            queue = new int[k];
            idxHead = 0;
            idxTail = -1;
            capacity = k;
            size = 0;
        }

        public boolean enQueue(int value) {
            if (isFull()) {
                return false;
            }

            idxTail = (idxTail + 1) % capacity;
            queue[idxTail] = value;
            size++;
            return true;
        }

        public boolean deQueue() {
            if (isEmpty()) {
                return false;
            }

            if (idxHead == idxTail) {
                idxHead = 0;
                idxTail = -1;
            } else {
                idxHead = (idxHead + 1) % capacity;
            }
            size--;
            return true;
        }

        public int Front() {
            if (isEmpty()) {
                return -1;
            }

            return queue[idxHead];
        }

        public int Rear() {
            if (isEmpty()) {
                return -1;
            }

            return queue[idxTail];
        }

        public boolean isEmpty() {
            if (size != 0) {
                return false;
            }

            return true;
        }

        public boolean isFull() {
            if (size != capacity) {
                return false;
            }

            return true;
        }
    }
}

package io.github.bluething.playground.codinginterview.leetcode.stackqueue101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ImplementQueueUsingStacksTest {
    @Test
    void case01() {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        Assertions.assertEquals(1, myQueue.peek());
        Assertions.assertEquals(1, myQueue.pop());
        Assertions.assertFalse(myQueue.empty());
    }

    class MyQueue {

        public MyQueue() {

        }

        public void push(int x) {

        }

        public int pop() {
            return 0;
        }

        public int peek() {
            return 0;
        }

        public boolean empty() {
            return false;
        }
    }
}

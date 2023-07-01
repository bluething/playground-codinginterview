package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/implement-queue-using-stacks/
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
            return true;
        }
    }
}

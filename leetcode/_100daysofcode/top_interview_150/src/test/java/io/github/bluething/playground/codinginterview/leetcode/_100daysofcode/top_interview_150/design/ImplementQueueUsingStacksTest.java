package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Queue;
import java.util.Stack;

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

    @Test
    void case02() {
        MyQueue2 myQueue = new MyQueue2();
        myQueue.push(1);
        myQueue.push(2);
        Assertions.assertEquals(1, myQueue.peek());
        Assertions.assertEquals(1, myQueue.pop());
        Assertions.assertFalse(myQueue.empty());
    }

    class MyQueue {

        private final Stack<Integer> queue1;
        private final Stack<Integer> queue2;

        public MyQueue() {
            queue1 = new Stack<>();
            queue2 = new Stack<>();
        }

        // the key is we use one of the stack, the other is like a temp
        public void push(int x) {
            while (!queue1.isEmpty()) {
                queue2.push(queue1.pop());
            }
            queue2.push(x);
            while (!queue2.isEmpty()) {
                queue1.push(queue2.pop());
            }
        }

        public int pop() {
            return queue1.pop();
        }

        public int peek() {
            return queue1.peek();
        }

        public boolean empty() {
            return queue1.isEmpty();
        }
    }

    // in this class we use both stack as a queue
    // queue2 will contain queue1 values in reverse order
    // the 1st key is in pop()
    //  we fill the queue2 when empty
    //  as long as the queue2 not empty, we can get front element with pop() or peek()
    // the 2nd key is we need to keep track ke front (latest pop) value
    //  in case the queue2 is empty we can return the value from front variable, no need to move value from queue1 like pop()
    class MyQueue2 {

        private final Stack<Integer> queue1;
        private final Stack<Integer> queue2;

        private int front;

        public MyQueue2() {
            queue1 = new Stack<>();
            queue2 = new Stack<>();
        }

        public void push(int x) {
            if (queue1.isEmpty()) {
                front = x;
            }
            queue1.push(x);
        }

        public int pop() {
            if (queue2.isEmpty()) {
                while (!queue1.isEmpty()) {
                    queue2.push(queue1.pop());
                }
            }
            return queue2.pop();
        }

        public int peek() {
            if (!queue2.isEmpty()) {
                return queue2.peek();
            }

            return front;
        }

        public boolean empty() {
            return queue1.isEmpty() && queue2.isEmpty();
        }
    }
}

package io.github.bluething.playground.codinginterview.leetcode.stackqueue101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

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
        Stack<Integer> stack1;
        Stack<Integer> stack2;
        int front;

        public MyQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void push(int x) {
            if (stack1.isEmpty()) {
                front = x;
            }
            stack1.push(x);
        }

        public int pop() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

        public int peek() {
            if (!stack2.isEmpty()) {
                return stack2.peek();
            }
            return front;
        }

        public boolean empty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }
}

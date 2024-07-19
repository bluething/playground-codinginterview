package io.github.bluething.playground.codinginterview.leetcode.stackqueue101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

class ImplementStackUsingQueuesTest {
    @Test
    void case01() {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        Assertions.assertEquals(2, myStack.top());
        Assertions.assertEquals(2, myStack.pop());
        Assertions.assertFalse(myStack.empty());
    }

    @Test
    void case02() {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        Assertions.assertEquals(2, myStack.pop());
        Assertions.assertEquals(1, myStack.top());
        Assertions.assertFalse(myStack.empty());
    }

    class MyStack {
        private Queue<Integer> queue;

        public MyStack() {
            queue = new LinkedList<>();
        }

        public void push(int x) {
            queue.add(x);
            int size = queue.size();
            while (size > 1) {
                queue.add(queue.remove());
                size--;
            }
        }

        public int pop() {
            return queue.remove();
        }

        public int top() {
            return queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/implement-stack-using-queues
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

        private Queue<Integer> queue1;
        private Queue<Integer> queue2;
        private int top;

        public MyStack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }

        public void push(int x) {
            queue1.add(x);
            top = x;
        }

        public int pop() {
            while (queue1.size() > 1) {
                top = queue1.remove();
                queue2.add(top);
            }
            int res = queue1.remove();
            Queue<Integer> tmp = queue1;
            queue1 = queue2;
            queue2 = tmp;

            return res;
        }

        public int top() {
            return top;
        }

        public boolean empty() {
            return queue1.isEmpty();
        }
    }
}

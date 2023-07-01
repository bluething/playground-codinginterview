package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

    class MyStack {

        public MyStack() {

        }

        public void push(int x) {

        }

        public int pop() {

        }

        public int top() {

        }

        public boolean empty() {

        }
    }
}

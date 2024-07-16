package io.github.bluething.playground.codinginterview.leetcode.stackqueue101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

        public MyStack() {

        }

        public void push(int x) {

        }

        public int pop() {
            return 0;
        }

        public int top() {
            return 0;
        }

        public boolean empty() {
            return false;
        }
    }
}

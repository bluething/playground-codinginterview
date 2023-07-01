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

    @Test
    void case03() {
        MyStack2 myStack = new MyStack2();
        myStack.push(1);
        myStack.push(2);
        Assertions.assertEquals(2, myStack.top());
        Assertions.assertEquals(2, myStack.pop());
        Assertions.assertFalse(myStack.empty());
    }

    @Test
    void case04() {
        MyStack2 myStack = new MyStack2();
        myStack.push(1);
        myStack.push(2);
        Assertions.assertEquals(2, myStack.pop());
        Assertions.assertEquals(1, myStack.top());
        Assertions.assertFalse(myStack.empty());
    }

    @Test
    void case05() {
        MyStack3 myStack = new MyStack3();
        myStack.push(1);
        myStack.push(2);
        Assertions.assertEquals(2, myStack.top());
        Assertions.assertEquals(2, myStack.pop());
        Assertions.assertFalse(myStack.empty());
    }

    @Test
    void case06() {
        MyStack3 myStack = new MyStack3();
        myStack.push(1);
        myStack.push(2);
        Assertions.assertEquals(2, myStack.pop());
        Assertions.assertEquals(1, myStack.top());
        Assertions.assertFalse(myStack.empty());
    }

    // the 1st key is we need to keep track the top value
    //  so, we don't need to move value between queue in peek()
    // in pop(), we move value from queue1 to queueTemp except the bottom element (the front in stack)
    //  then we switch between queue1 and queueTmp
    class MyStack {

        private Queue<Integer> queue1;
        private Queue<Integer> queueTmp;
        private int top;

        public MyStack() {
            queue1 = new LinkedList<>();
            queueTmp = new LinkedList<>();
        }

        public void push(int x) {
            queue1.add(x);
            top = x;
        }

        public int pop() {
            while (queue1.size() > 1) {
                top = queue1.remove();
                queueTmp.add(top);
            }
            int res = queue1.remove();
            Queue<Integer> tmp = queue1;
            queue1 = queueTmp;
            queueTmp = tmp;

            return res;
        }

        public int top() {
            return top;
        }

        public boolean empty() {
            return queue1.isEmpty();
        }
    }

    class MyStack2 {

        private Queue<Integer> queue1;
        private Queue<Integer> queue2;
        private int top;

        public MyStack2() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }

        public void push(int x) {
            queue2.add(x);
            while (!queue1.isEmpty()) {
                queue2.add(queue1.remove());
            }

            Queue<Integer> tmp = queue1;
            queue1 = queue2;
            queue2 = tmp;
        }

        public int pop() {
            return queue1.remove();
        }

        public int top() {
            return queue1.peek();
        }

        public boolean empty() {
            return queue1.isEmpty();
        }
    }

    // using only 1 queue
    // the key is when we push new value we need to move existing value to the end of the queue (like pop-push with temp)
    class MyStack3 {

        private Queue<Integer> queue;

        public MyStack3() {
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

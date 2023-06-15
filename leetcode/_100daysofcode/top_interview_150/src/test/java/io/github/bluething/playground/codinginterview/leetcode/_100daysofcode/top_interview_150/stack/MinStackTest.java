package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/min-stack/?envType=study-plan-v2&envId=top-interview-150
class MinStackTest {

    @Test
    void case01() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        Assertions.assertEquals(-3, minStack.getMin());
        minStack.pop();
        Assertions.assertEquals(0, minStack.top());
        Assertions.assertEquals(-2, minStack.getMin());
    }


    // the idea is using linked list as an internal data structure
    // when we push the new element, we need to know if the list empty or not
    // if not empty (there are some nodes) then we need to calculate the min value
    // then we need to point the next element to the current element (pointing to the element before)
    class MinStack {

        private Node head;

        public MinStack() {

        }

        void push(int val) {
            if (head == null) {
                head = new Node(val, val, null);
            } else {
                head = new Node(val, Math.min(val, head.min), head);
            }
        }

        void pop() {
            head = head.next;
        }

        int top() {
            return head.val;
        }

        int getMin() {
            return head.min;
        }

        private class Node {
            private final int val;
            private int min;
            Node next;

            Node(int val, int min, Node next) {
                this.val = val;
                this.min = min;
                this.next = next;
            }
        }
    }
}

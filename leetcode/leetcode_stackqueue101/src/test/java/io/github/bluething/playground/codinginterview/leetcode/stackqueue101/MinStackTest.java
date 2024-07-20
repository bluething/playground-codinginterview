package io.github.bluething.playground.codinginterview.leetcode.stackqueue101;

class MinStackTest {
    class MinStack {

        private Node top;

        public MinStack() {

        }

        public void push(int val) {
            if (top == null) {
                top = new Node(val, val, null);
            } else {
                top = new Node(val, Math.min(top.min, val), top);
            }
        }

        public void pop() {
            top = top.next;
        }

        public int top() {
            return top.val;
        }

        public int getMin() {
            return top.min;
        }

        class Node {
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

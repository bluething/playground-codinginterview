package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.linked_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/copy-list-with-random-pointer/
class CopyListWithRandomPointer {

    @Test
    void case01() {
        Node _1 = new Node(1);
        Node _10 = new Node(1);
        _10.next = _1;
        Node _11 = new Node(1);
        _11.next = _10;
        Node _13 = new Node(1);
        _13.next = _11;
        Node _7 = new Node(1);
        _7.next = _13;

        _7.random = null;
        _13.random = _7;
        _11.random = _1;
        _10.random = _11;
        _1.random = _7;

        Assertions.assertEquals(_7, copyRandomList(_7));
    }

    @Test
    void case02() {
        Node _2 = new Node(2);
        Node _1 = new Node(1);
        _1.next = _2;

        _1.random = _2;
        _2.random = _2;

        Assertions.assertEquals(_1, copyRandomList(_1));
    }

    @Test
    void case03() {
        Node _33 = new Node(3);
        Node _32 = new Node(3);
        _32.next = _33;
        Node _31 = new Node(3);
        _31.next = _32;

        _31.random = null;
        _32.random = _31;
        _33.random = null;

        Assertions.assertEquals(_31, copyRandomList(_31));
    }

    private Node copyRandomList(Node head) {
        return null;
    }

    class Node {
        int val;
        Node next;
        Node random;

        Node() {
        }

        Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.linked_list;

import io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.ParentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/copy-list-with-random-pointer/description/
class CopyListWithRandomPointerTest extends ParentTest {

    @Test
    void case01() {
        Node _7 = new Node(7);
        Node _13 = new Node(13);
        Node _11 = new Node(11);
        Node _10 = new Node(10);
        Node _1 = new Node(1);
        _7.next = _13;
        _7.random = null;
        _13.next = _11;
        _13.random = _7;
        _11.next = _10;
        _11.random = _1;
        _10.next = _1;
        _10.random = _11;
        _1.next = null;
        _1.random = _7;

        Node copied = copyRandomList(_7);
        printLinkedList(copied);
        Assertions.assertEquals("7:-1#13:7#11:1#10:11#1:7#", output.toString());

    }

    void printLinkedList(Node head) {
        while (head != null) {
            System.out.printf("%d:%d#", head.val, head.random == null ? -1 : head.random.val);
            head = head.next;
        }
    }

    // using two pass
    private Node copyRandomList(Node head) {
        Map<Node, Node> nodes = new HashMap<>();

        Node curr = head;
        // 1st pass, copy all nodes
        while (curr != null) {
            nodes.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;
        // 2nd pass, link the nodes, both next and random
        while (curr != null) {
            nodes.get(curr).next = nodes.get(curr.next);
            nodes.get(curr).random = nodes.get(curr.random);
            curr = curr.next;
        }

        return nodes.get(head);
    }

    class Node {
        int val;
        Node next;
        Node random;

        Node() {
        }

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}

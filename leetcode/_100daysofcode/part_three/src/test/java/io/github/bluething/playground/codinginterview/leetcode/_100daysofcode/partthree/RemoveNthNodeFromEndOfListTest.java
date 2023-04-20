package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import io.github.bluething.playground.codinginterview.leetcode._100daysofcode.ParentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
class RemoveNthNodeFromEndOfListTest extends ParentTest {

    @Test
    void case01() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        removeNthFromEnd(node1, 2);
        printLinkedList(node1);
        Assertions.assertEquals("1235", output.toString());
    }

    @Test
    void case02() {
        ListNode node1 = new ListNode(1);
        removeNthFromEnd(node1, 1);
        printLinkedList(node1);
        Assertions.assertEquals("", output.toString());
    }

    @Test
    void case03() {
        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1, node2);
        removeNthFromEnd(node1, 1);
        printLinkedList(node1);
        Assertions.assertEquals("1", output.toString());
    }

    void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.printf("%d", head.val);
            head = head.next;
        }
    }

    private ListNode removeNthFromEnd(ListNode head, int n) {
        return head;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import io.github.bluething.playground.codinginterview.leetcode._100daysofcode.ParentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
class DeleteTheMiddleNodeOfALinkedListTest extends ParentTest {

    @Test
    void case01() {
        ListNode node7 = new ListNode(6);
        ListNode node6 = new ListNode(2, node7);
        ListNode node5 = new ListNode(1, node6);
        ListNode node4 = new ListNode(7, node5);
        ListNode node3 = new ListNode(4, node4);
        ListNode node2 = new ListNode(3, node3);
        ListNode node1 = new ListNode(1, node2);
        printLinkedList(deleteMiddle(node1));
        Assertions.assertEquals("134126", output.toString());
    }

    @Test
    void case02() {
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        printLinkedList(deleteMiddle(node1));
        Assertions.assertEquals("124", output.toString());
    }

    @Test
    void case03() {
        ListNode node2 = new ListNode(1);
        ListNode node1 = new ListNode(2, node2);
        printLinkedList(deleteMiddle(node1));
        Assertions.assertEquals("2", output.toString());
    }

    private ListNode deleteMiddle(ListNode head) {
        return null;
    }

    void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.printf("%d", head.val);
            head = head.next;
        }
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

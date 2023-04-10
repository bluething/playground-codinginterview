package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import io.github.bluething.playground.codinginterview.leetcode._100daysofcode.ParentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://www.geeksforgeeks.org/delete-n-nodes-after-m-nodes-of-a-linked-list/
class DeleteNNodesAfterMNodesOfALinkedListTest extends ParentTest {
    @Test
    void case01() {
        ListNode node8 = new ListNode(8);
        ListNode node7 = new ListNode(7, node8);
        ListNode node6 = new ListNode(6, node7);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        skipMDeleteN(node1, 2, 2);
        printLinkedList(node1);
        Assertions.assertEquals("1256", output.toString());
    }
    private void skipMDeleteN( ListNode head, int m, int n) {
        ListNode current = head, skipped;
        while (current != null) {
            for (int i = 1; i < m && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                return;
            }
            skipped = current.next;
            for (int i = 1; i <= n && skipped != null; i++) {
                skipped = skipped.next;
            }

            current.next = skipped;
            current = skipped;
        }
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

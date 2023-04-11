package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import io.github.bluething.playground.codinginterview.leetcode._100daysofcode.ParentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/reorder-list/
class ReorderListTest extends ParentTest {

    @Test
    void case01() {
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        reorderList(node1);
        printLinkedList(node1);
        Assertions.assertEquals("1423", output.toString());
    }

    @Test
    void case02() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        reorderList(node1);
        printLinkedList(node1);
        Assertions.assertEquals("15243", output.toString());
    }

    void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.printf("%d", head.val);
            head = head.next;
        }
    }

    private void reorderList(ListNode head) {
        // find middle
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse second half
        ListNode secondHalf = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode next = null;
        while (secondHalf != null) {
            next = secondHalf.next;
            secondHalf.next = prev;
            prev = secondHalf;
            secondHalf = next;
        }
        secondHalf = prev;

        // merge first half and second half
        ListNode firstHalf = head;
        ListNode tmp = null;
        while (firstHalf != null && secondHalf != null) {
            tmp = firstHalf.next;
            firstHalf.next = secondHalf;
            firstHalf = secondHalf;
            secondHalf = tmp;
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

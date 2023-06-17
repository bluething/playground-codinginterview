package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.linked_list;

import io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.ParentTest;
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
        // slow and fast pointer to get the middle node
        // fast pointer start from slow+1 because we want to reach the last node
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse the list from middle + 1
        // point to the next node after mid
        ListNode secondHalf = slow.next;
        // cut the head from start to mid
        slow.next = null;
        ListNode temp = null;
        ListNode prev = null;
        while (secondHalf != null) {
            temp = secondHalf.next;
            secondHalf.next = prev;
            prev = secondHalf;
            secondHalf = temp;
        }
        secondHalf = prev;

        // merge first half (head) and second half
        // merge 1-2 and 4-3
        ListNode firstHalf = head;
        ListNode temp1, temp2 = null;
        while (secondHalf != null) {
            temp1 = firstHalf.next;
            temp2 = secondHalf.next;
            firstHalf.next = secondHalf;
            secondHalf.next = temp1;
            firstHalf = temp1;
            secondHalf = temp2;
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

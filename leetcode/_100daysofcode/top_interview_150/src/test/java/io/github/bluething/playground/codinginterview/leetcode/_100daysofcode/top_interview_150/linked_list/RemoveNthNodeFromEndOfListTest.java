package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.linked_list;

import io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.ParentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/?envType=study-plan-v2&envId=top-interview-150
class RemoveNthNodeFromEndOfListTest extends ParentTest {
    @Test
    void case01() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode result =  removeNthFromEnd(node1, 2);
        printLinkedList(result);
        Assertions.assertEquals("1235", output.toString());
    }

    @Test
    void case02() {
        ListNode node1 = new ListNode(1);
        ListNode result =  removeNthFromEnd(node1, 1);
        printLinkedList(result);
        Assertions.assertEquals("", output.toString());
    }

    @Test
    void case03() {
        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1, node2);
        ListNode result =  removeNthFromEnd(node1, 1);
        printLinkedList(result);
        Assertions.assertEquals("1", output.toString());
    }

    void printLinkedList(ListNode head) {
        if (head == null) {
            System.out.printf("");
            return;
        }
        while (head != null) {
            System.out.printf("%d", head.val);
            head = head.next;
        }
    }

    // we need to have a pointer that point to the nth node
    // we will use 2 pointers
    private ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy;
        ListNode right = head;
        // the ide is move the right pointer as far as n
        while (n > 0) {
            right = right.next;
            n--;
        }
        // then we move both pointer until right pointer reach the end of list
        // so we will have left pointer point to the nth node, because right pointer is n nodes ahead
        while (right != null) {
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;

        return dummy.next;
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

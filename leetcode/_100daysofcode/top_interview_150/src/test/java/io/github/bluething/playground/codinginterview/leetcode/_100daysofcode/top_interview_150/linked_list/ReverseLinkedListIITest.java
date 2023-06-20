package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.linked_list;

import io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.ParentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/reverse-linked-list-ii/?envType=study-plan-v2&envId=top-interview-150
class ReverseLinkedListIITest extends ParentTest {

    @Test
    void case01() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode result = reverseBetween(node1, 2, 4);
        printLinkedList(result);
        Assertions.assertEquals("14325", output.toString());
    }

    @Test
    void case02() {
        ListNode node5 = new ListNode(5);
        ListNode result = reverseBetween(node5, 1, 1);
        printLinkedList(result);
        Assertions.assertEquals("5", output.toString());
    }

    @Test
    void case03() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode result = reverseBetween2(node1, 2, 4);
        printLinkedList(result);
        Assertions.assertEquals("14325", output.toString());
    }

    @Test
    void case04() {
        ListNode node5 = new ListNode(5);
        ListNode result = reverseBetween2(node5, 1, 1);
        printLinkedList(result);
        Assertions.assertEquals("5", output.toString());
    }

    void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.printf("%d", head.val);
            head = head.next;
        }
    }

    private ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0, head);
        ListNode leftPrev = dummy;
        ListNode current = head;
        // move pointer to position left
        for (int i = 1; i < left; i++) {
            leftPrev = current;
            current = current.next;
        }

        // current = node at left position
        // leftPrev = node before left
        // reverse from left to right
        ListNode prev = null;
        ListNode temp = null;
        for (int i = 1; i <= right-left+1; i++) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        // update pointer, because reversed list don't have pointer to the original list (already broken)
        leftPrev.next.next = current;
        leftPrev.next = prev;

        return dummy.next;
    }

    private ListNode reverseBetween2(ListNode head, int left, int right) {
        if (head == null || head.next == null || left <= 0 || right <= 0 || left == right) {
            return head;
        }

        ListNode preHead = new ListNode(0);
        preHead.next = head;

        ListNode prev = preHead;
        // move prev pointer to the lef-1 position
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // current pointer will point to the left position
        // reverse the list as much as right-left+1
        ListNode current = prev.next;
        ListNode temp = null;
        ListNode reversedHead = null;
        for (int i = 1; i <= right - left + 1; i++) {
            temp = current.next;
            current.next = reversedHead;
            reversedHead = current;
            current = temp;
        }

        // we need to connecting the reversed list to the main list
        prev.next.next = current;
        prev.next = reversedHead;

        return preHead.next;
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

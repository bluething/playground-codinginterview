package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.linked_list;

import io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.ParentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/middle-of-the-linked-list/description/
class MiddleOfheLinkedListTest extends ParentTest {

    @Test
    void case01() {
        ListNode _5 = new ListNode(5);
        ListNode _4 = new ListNode(4, _5);
        ListNode _3 = new ListNode(3, _4);
        ListNode _2 = new ListNode(2, _3);
        ListNode _1 = new ListNode(1, _2);
        ListNode middle = middleNode(_1);
        printLinkedList(middle);
        Assertions.assertEquals("345", output.toString());
    }

    @Test
    void case02() {
        ListNode _6 = new ListNode(6);
        ListNode _5 = new ListNode(5, _6);
        ListNode _4 = new ListNode(4, _5);
        ListNode _3 = new ListNode(3, _4);
        ListNode _2 = new ListNode(2, _3);
        ListNode _1 = new ListNode(1, _2);
        ListNode middle = middleNode(_1);
        printLinkedList(middle);
        Assertions.assertEquals("456", output.toString());
    }

    void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.printf("%d", head.val);
            head = head.next;
        }
    }

    private ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
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

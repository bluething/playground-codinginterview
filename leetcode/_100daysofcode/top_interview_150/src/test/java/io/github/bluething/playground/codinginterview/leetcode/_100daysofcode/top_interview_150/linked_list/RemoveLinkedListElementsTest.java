package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.linked_list;

import io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.ParentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/remove-linked-list-elements/description/
class RemoveLinkedListElementsTest extends ParentTest {

    @Test
    void case01() {
        ListNode _62 = new ListNode(6);
        ListNode _5 = new ListNode(5, _62);
        ListNode _4 = new ListNode(4, _5);
        ListNode _3 = new ListNode(3, _4);
        ListNode _6 = new ListNode(6, _3);
        ListNode _2 = new ListNode(2, _6);
        ListNode _1 = new ListNode(1, _2);
        ListNode removed = removeElements(_1, 6);
        printLinkedList(removed);
        Assertions.assertEquals("12345", output.toString());
    }

    @Test
    void case02() {
        ListNode empty = new ListNode();
        ListNode removed = removeElements(empty, 1);
        printLinkedList(removed);
        Assertions.assertEquals("0", output.toString());

    }

    @Test
    void case03() {
        ListNode _74 = new ListNode(7);
        ListNode _73 = new ListNode(7, _74);
        ListNode _72 = new ListNode(7, _73);
        ListNode _71 = new ListNode(7, _72);
        ListNode removed = removeElements(_71, 7);
        printLinkedList(removed);
        Assertions.assertEquals("", output.toString());
    }

    void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.printf("%d", head.val);
            head = head.next;
        }
    }

    private ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        // when the next node not null
        // give the rest of the list to next recursion
        // in the next recursion we will check if the value equal to val
        if (head.next != null) {
            head.next = removeElements(head.next, val);
        }

        // when the current value equal to val, return the next node
        if (head.val == val) {
            return head.next;
        } else {
            return head;
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

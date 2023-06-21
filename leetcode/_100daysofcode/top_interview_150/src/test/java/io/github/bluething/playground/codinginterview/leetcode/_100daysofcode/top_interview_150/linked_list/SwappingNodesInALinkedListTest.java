package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.linked_list;


import io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.ParentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/
class SwappingNodesInALinkedListTest extends ParentTest {

    @Test
    void case01() {
        ListNode _5 = new ListNode(5);
        ListNode _4 = new ListNode(4, _5);
        ListNode _3 = new ListNode(3, _4);
        ListNode _2 = new ListNode(2, _3);
        ListNode _1 = new ListNode(1, _2);
        ListNode swapped = swapNodes(_1, 2);
        printLinkedList(swapped);
        Assertions.assertEquals("14325", output.toString());
    }

    @Test
    void case02() {
        ListNode _5 = new ListNode(5);
        ListNode _92 = new ListNode(9, _5);
        ListNode _0 = new ListNode(0, _92);
        ListNode _3 = new ListNode(3, _0);
        ListNode _8 = new ListNode(8, _3);
        ListNode _72 = new ListNode(7, _8);
        ListNode _62 = new ListNode(6, _72);
        ListNode _6 = new ListNode(6, _62);
        ListNode _9 = new ListNode(9, _6);
        ListNode _7 = new ListNode(7, _9);
        ListNode swapped = swapNodes(_7, 5);
        printLinkedList(swapped);
        Assertions.assertEquals("7966873095", output.toString());
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

    private ListNode swapNodes(ListNode head, int k) {
        ListNode pointer = head;
        ListNode leftKth = head;
        ListNode rightKth = head;
        // move the pointer to the kth node then assign to the leftKth object
        for (int i = 1; i < k; i++) {
            pointer = pointer.next;
        }
        leftKth = pointer;
        // move pointer to the next node because we want to move the pointer to the right kth node
        pointer = pointer.next;

        // just move the pointer until the end of list
        // then we will have a rightKth node point to the right kth node
        while (pointer != null) {
            pointer = pointer.next;
            rightKth = rightKth.next;
        }

        int tmpVal = leftKth.val;
        leftKth.val = rightKth.val;
        rightKth.val = tmpVal;

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

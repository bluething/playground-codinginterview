package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.linked_list;

import io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.ParentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/
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

    void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.printf("%d", head.val);
            head = head.next;
        }
    }

    private ListNode deleteMiddle(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode slow = dummy;
        ListNode fast = dummy;
        // find the middle, start from 1st node loop until fast pointer reach end of list or 1 node before end list (for even nodes)
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // to delete the mid node we just change the pointer to the next node after next mid node
        slow.next = slow.next.next;

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

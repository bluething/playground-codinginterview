package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.linked_list;

import io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.ParentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

// https://leetcode.com/problems/reverse-linked-list/
class ReverseLinkedListTest extends ParentTest {

    @Test
    void case01() {
        ListNode five = new ListNode(5);
        ListNode four = new ListNode(4, five);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode one = new ListNode(1, two);

        one = reverseList(one);
        printLinkedList(one);

        Assertions.assertEquals("54321", output.toString());
    }

    @Test
    void case02() {
        ListNode five = new ListNode(5);
        ListNode four = new ListNode(4, five);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode one = new ListNode(1, two);

        one = reverseList2(one);
        printLinkedList(one);

        Assertions.assertEquals("54321", output.toString());
    }

    @Test
    void case03() {
        ListNode five = new ListNode(5);
        ListNode four = new ListNode(4, five);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode one = new ListNode(1, two);

        one = reverseList3(one);
        printLinkedList(one);

        Assertions.assertEquals("54321", output.toString());
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

    private ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        Stack<ListNode> nodes = new Stack<>();
        ListNode pointer = head;
        while (pointer != null) {
            nodes.push(pointer);
            pointer = pointer.next;
        }

        head = nodes.pop();
        pointer = head;

        // use pointer to update next head
        while (!nodes.empty()) {
            pointer.next = nodes.pop();
            pointer = pointer.next;
        }

        pointer.next = null;

        return head;
    }

    // using two pointers, curr and prev
    // curr.next = prev
    // prev = curr
    // curr = curr.next ?
    // the problem is we lost the link in curr.next
    // use temp node to store curr.next then assign it to curr
    private ListNode reverseList2(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        // temp for store next node that will be swap with prev
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;

        return head;
    }

    private ListNode reverseList3(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode result = reverseList3(head.next);
        // result 5
        // reverse sub nodes in head
        // 4-5-null
        // to 4-5-[4-5] (pointing back to head)
        // the result become 5-4-[5-4] (pointing back)
        head.next.next = head;
        // then 4-null
        // the result become 5-4-null
        head.next = null;

        return result;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

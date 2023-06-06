package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.linked_list;

import io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.ParentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/merge-two-sorted-lists/?envType=study-plan-v2&id=top-interview-150
class MergeTwoSortedListsTest extends ParentTest {

    @Test
    void case01() {
        ListNode fourOne = new ListNode(4);
        ListNode twoOne = new ListNode(2, fourOne);
        ListNode oneOne = new ListNode(1, twoOne);

        ListNode fourTwo = new ListNode(4);
        ListNode threeTwo = new ListNode(3, fourTwo);
        ListNode oneTwo = new ListNode(1, threeTwo);

        ListNode merged = mergeTwoLists(oneTwo, oneOne);
        printLinkedList(merged);

        Assertions.assertEquals("112344", output.toString());
    }

    @Test
    void case02() {
        ListNode fourOne = new ListNode(4);
        ListNode twoOne = new ListNode(2, fourOne);
        ListNode oneOne = new ListNode(1, twoOne);

        ListNode fourTwo = new ListNode(4);
        ListNode threeTwo = new ListNode(3, fourTwo);
        ListNode oneTwo = new ListNode(1, threeTwo);

        ListNode merged = mergeTwoLists2(oneTwo, oneOne);
        printLinkedList(merged);

        Assertions.assertEquals("112344", output.toString());
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

    // use pointer to modify the merged node
    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode(-1);
        ListNode pointer = merged;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                pointer.next = list1;
                list1 = list1.next;
            } else {
                pointer.next = list2;
                list2 = list2.next;
            }

            pointer = pointer.next;
        }

        // the rest between list1 or list2
        pointer.next = list1 == null ? list2 : list1;

        return merged.next;
    }

    private ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        // base case
        // when the list is null return other list
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode merged;
        if (list1.val <= list2.val) {
            merged = list1;
            merged.next = mergeTwoLists2(list1.next, list2);
        } else {
            merged = list2;
            merged.next = mergeTwoLists2(list1, list2.next);
        }

        return merged;
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

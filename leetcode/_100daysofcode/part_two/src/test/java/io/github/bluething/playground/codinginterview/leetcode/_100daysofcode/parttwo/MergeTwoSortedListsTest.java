package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.parttwo;

import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/merge-two-sorted-lists/description/
public class MergeTwoSortedListsTest {

    @Test
    public void case01() {
        ListNode fourOne = new ListNode(4);
        ListNode twoOne = new ListNode(2, fourOne);
        ListNode oneOne = new ListNode(1, twoOne);

        ListNode fourTwo = new ListNode(4);
        ListNode threeTwo = new ListNode(3, fourTwo);
        ListNode oneTwo = new ListNode(1, threeTwo);

        mergeTwoLists(oneTwo, oneOne);
    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        // compare the head
        // for list that have smaller value, give the head to merged
        // now, we want to find which value become the next node
        // recursively give the next smaller list node and the other one to the next call
        ListNode merged = null;
        if (list1.val <= list2.val) {
            merged = list1;
            merged.next = mergeTwoLists(list1.next, list2);
        } else {
            merged = list2;
            merged.next = mergeTwoLists(list1, list2.next);
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

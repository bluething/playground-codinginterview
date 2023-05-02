package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.linked_list;

import org.junit.jupiter.api.Test;

public class MergeTwoSortedListsTest {

    @Test
    void case01() {
        ListNode fourOne = new ListNode(4);
        ListNode twoOne = new ListNode(2, fourOne);
        ListNode oneOne = new ListNode(1, twoOne);

        ListNode fourTwo = new ListNode(4);
        ListNode threeTwo = new ListNode(3, fourTwo);
        ListNode oneTwo = new ListNode(1, threeTwo);

        mergeTwoLists(oneTwo, oneOne);
    }

    @Test
    void case02() {
        ListNode fourOne = new ListNode(4);
        ListNode twoOne = new ListNode(2, fourOne);
        ListNode oneOne = new ListNode(1, twoOne);

        ListNode fourTwo = new ListNode(4);
        ListNode threeTwo = new ListNode(3, fourTwo);
        ListNode oneTwo = new ListNode(1, threeTwo);

        mergeTwoLists2(oneTwo, oneOne);
    }

    // compare the head
    // for node that have smaller value, give the head to the merged list
    // recursively, find for the next merged node
    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode merged = new ListNode();
        if (list1.val <= list2.val) {
            merged = list1;
            merged.next = mergeTwoLists(list1.next, list2);
        }
        else {
            merged = list2;
            merged.next = mergeTwoLists(list1, list2.next);
        }
        return merged;
    }

    private ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
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

        pointer.next = list1 == null ? list2 : list1;

        return merged.next;
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

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

public class MergeTwoSortedListsTest {

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

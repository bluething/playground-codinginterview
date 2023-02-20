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
        return null;
    }

    class ListNode {
        int val;
        io.github.bluething.playground.codinginterview.leetcode._100daysofcode.parttwo.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, io.github.bluething.playground.codinginterview.leetcode._100daysofcode.parttwo.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

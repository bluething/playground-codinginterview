package io.github.bluething.playground.codinginterview.leetcode.linkedlist101;

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

    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return null;
    }
}

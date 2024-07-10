package io.github.bluething.playground.codinginterview.leetcode.twopointers101;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesromSortedListIITest {
    @Test
    void case01() {
        ListNode five = new ListNode(4);
        ListNode four2 = new ListNode(4, five);
        ListNode four = new ListNode(4, four2);
        ListNode three2 = new ListNode(3);
        ListNode three1 = new ListNode(3, three2);
        ListNode two = new ListNode(2, three1);
        ListNode one = new ListNode(1, two);

        ListNode deleted = deleteDuplicates(one);
    }

    private ListNode deleteDuplicates(ListNode head) {
        return null;
    }

    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}

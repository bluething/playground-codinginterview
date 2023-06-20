package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.linked_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/
class MaximumTwinSumOfALinkedListTest {

    @Test
    void case01() {
        ListNode _1 = new ListNode(1);
        ListNode _2 = new ListNode(2, _1);
        ListNode _4 = new ListNode(4, _2);
        ListNode _5 = new ListNode(5, _4);
        Assertions.assertEquals(6, pairSum(_5));
    }

    @Test
    void case02() {
        ListNode _3 = new ListNode(3);
        ListNode _22 = new ListNode(2, _3);
        ListNode _2 = new ListNode(2, _22);
        ListNode _4 = new ListNode(4, _2);
        Assertions.assertEquals(7, pairSum(_4));
    }

    @Test
    void case03() {
        ListNode _100000 = new ListNode(100000);
        ListNode _1 = new ListNode(1, _100000);
        Assertions.assertEquals(100001, pairSum(_1));
    }

    private int pairSum(ListNode head) {
        return 0;
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

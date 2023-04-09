package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
class ConvertBinaryNumberInALinkedListToIntegerTest {
    @Test
    void case01() {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        Assertions.assertEquals(5, getDecimalValue(node1));
    }

    @Test
    void case02() {
        ListNode node = new ListNode(0);
        Assertions.assertEquals(0, getDecimalValue(node));
    }

    private int getDecimalValue(ListNode head) {
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

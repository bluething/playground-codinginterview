package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListCycleTest {

    @Test
    void case01() {
        ListNode minus4 = new ListNode(-4);
        ListNode zero = new ListNode(0, minus4);
        ListNode two = new ListNode(2, zero);
        minus4.next = two;
        ListNode three = new ListNode(3, two);
        Assertions.assertTrue(hasCycle(three));
    }

    @Test
    void case02() {
        ListNode two = new ListNode(2);
        ListNode one = new ListNode(1, two);
        two.next = one;
        Assertions.assertTrue(hasCycle(one));
    }

    @Test
    void case03() {
        ListNode one = new ListNode(1);
        Assertions.assertFalse(hasCycle(one));
    }

    @Test
    void case04() {
        ListNode minus4 = new ListNode(-4);
        ListNode zero = new ListNode(0, minus4);
        ListNode two = new ListNode(2, zero);
        minus4.next = two;
        ListNode three = new ListNode(3, two);
        Assertions.assertTrue(hasCycle2(three));
    }

    @Test
    void case05() {
        ListNode two = new ListNode(2);
        ListNode one = new ListNode(1, two);
        two.next = one;
        Assertions.assertTrue(hasCycle2(one));
    }

    @Test
    void case06() {
        ListNode one = new ListNode(1);
        Assertions.assertFalse(hasCycle2(one));
    }

    private boolean hasCycle(ListNode head) {
        int visitedVal = Integer.MIN_VALUE;
        while (head != null) {
            if (head.val == visitedVal) {
                return true;
            }
            head.val = visitedVal;
            head = head.next;
        }
        return false;
    }

    private boolean hasCycle2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && slow != null && fast.next != null) {
            if (fast == slow) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }

        return false;
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

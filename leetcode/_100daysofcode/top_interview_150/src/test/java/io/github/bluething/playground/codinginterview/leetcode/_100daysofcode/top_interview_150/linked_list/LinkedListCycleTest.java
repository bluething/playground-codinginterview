package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.linked_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/linked-list-cycle/?envType=study-plan-v2&id=top-interview-150
class LinkedListCycleTest {

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
        ListNode two = new ListNode(2);
        ListNode one = new ListNode(1, two);
        Assertions.assertFalse(hasCycle(one));
    }

    @Test
    void case05() {
        ListNode minus4 = new ListNode(-4);
        ListNode zero = new ListNode(0, minus4);
        ListNode two = new ListNode(2, zero);
        minus4.next = two;
        ListNode three = new ListNode(3, two);
        Assertions.assertTrue(hasCycle2(three));
    }

    @Test
    void case06() {
        ListNode two = new ListNode(2);
        ListNode one = new ListNode(1, two);
        two.next = one;
        Assertions.assertTrue(hasCycle2(one));
    }

    @Test
    void case07() {
        ListNode one = new ListNode(1);
        Assertions.assertFalse(hasCycle2(one));
    }

    @Test
    void case08() {
        ListNode two = new ListNode(2);
        ListNode one = new ListNode(1, two);
        Assertions.assertFalse(hasCycle2(one));
    }

    // it's like a race
    // slower person will be catch up by faster person
    private boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && slow != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    private boolean hasCycle2(ListNode head) {
        int mark = Integer.MIN_VALUE;
        while (head != null) {
            if (head.val == mark) {
                return true;
            }
            head.val = mark;
            head = head.next;
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

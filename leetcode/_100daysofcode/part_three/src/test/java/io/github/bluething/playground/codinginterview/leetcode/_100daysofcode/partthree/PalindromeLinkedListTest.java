package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeLinkedListTest {

    @Test
    void case01() {
        ListNode one2 = new ListNode(1);
        ListNode two2 = new ListNode(2, one2);
        ListNode two1 = new ListNode(2, two2);
        ListNode one1 = new ListNode(1, two1);
        Assertions.assertTrue(isPalindrome(one1));
    }

    @Test
    void case02() {
        ListNode two1 = new ListNode(2);
        ListNode one1 = new ListNode(1, two1);
        Assertions.assertFalse(isPalindrome(one1));
    }

    @Test
    void case03() {
        ListNode one2 = new ListNode(1);
        ListNode two2 = new ListNode(2, one2);
        ListNode two1 = new ListNode(2, two2);
        ListNode one1 = new ListNode(1, two1);
        Assertions.assertTrue(isPalindrome2(one1));
    }

    @Test
    void case04() {
        ListNode two1 = new ListNode(2);
        ListNode one1 = new ListNode(1, two1);
        Assertions.assertFalse(isPalindrome2(one1));
    }

    private boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null
                && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        slow = reverse(slow);
        fast = head;

        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    private boolean isPalindrome2(ListNode head) {
        return true;
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

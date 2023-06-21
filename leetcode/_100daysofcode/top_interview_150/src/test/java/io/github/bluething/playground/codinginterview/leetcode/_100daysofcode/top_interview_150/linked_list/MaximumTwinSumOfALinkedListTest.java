package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.linked_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    void case04() {
        ListNode _1 = new ListNode(1);
        ListNode _2 = new ListNode(2, _1);
        ListNode _4 = new ListNode(4, _2);
        ListNode _5 = new ListNode(5, _4);
        Assertions.assertEquals(6, pairSum2(_5));
    }

    @Test
    void case05() {
        ListNode _3 = new ListNode(3);
        ListNode _22 = new ListNode(2, _3);
        ListNode _2 = new ListNode(2, _22);
        ListNode _4 = new ListNode(4, _2);
        Assertions.assertEquals(7, pairSum2(_4));
    }

    @Test
    void case06() {
        ListNode _100000 = new ListNode(100000);
        ListNode _1 = new ListNode(1, _100000);
        Assertions.assertEquals(100001, pairSum2(_1));
    }

    @Test
    void case07() {
        ListNode _1 = new ListNode(1);
        ListNode _2 = new ListNode(2, _1);
        ListNode _4 = new ListNode(4, _2);
        ListNode _5 = new ListNode(5, _4);
        Assertions.assertEquals(6, pairSum3(_5));
    }

    @Test
    void case08() {
        ListNode _3 = new ListNode(3);
        ListNode _22 = new ListNode(2, _3);
        ListNode _2 = new ListNode(2, _22);
        ListNode _4 = new ListNode(4, _2);
        Assertions.assertEquals(7, pairSum3(_4));
    }

    @Test
    void case09() {
        ListNode _100000 = new ListNode(100000);
        ListNode _1 = new ListNode(1, _100000);
        Assertions.assertEquals(100001, pairSum3(_1));
    }

    private int pairSum(ListNode head) {
        List<Integer> headVals = new ArrayList<>();
        while (head != null) {
            headVals.add(head.val);
            head = head.next;
        }

        int left = 0;
        int right = headVals.size()-1;
        int maxSum = Integer.MIN_VALUE;
        while (left < right) {
            maxSum = Integer.max(maxSum, headVals.get(left) + headVals.get(right));
            left++;
            right--;
        }

        return maxSum;
    }

    // using slow and fast pointer
    // but, when move the slow pointer, we also reverse the 1st half list
    // then we will have prev pointer point to the head of reversed 1st half list
    // and slow pointer to the head 2nd half list
    // the key is the prev pointer always assign to slow before slow move to the next node
    private int pairSum2(ListNode head) {
        ListNode prev = null;
        ListNode temp = null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            // reverse 1st half of the list
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        int maxSum = Integer.MIN_VALUE;
        while (slow != null) {
            maxSum = Integer.max(maxSum, prev.val + slow.val);
            prev = prev.next;
            slow = slow.next;
        }

        return maxSum;
    }

    // reverse 2nd half list
    private int pairSum3(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalfReversedHead = null;
        ListNode temp = null;
        while (slow != null) {
            temp = slow.next;
            slow.next = secondHalfReversedHead;
            secondHalfReversedHead = slow;
            slow = temp;
        }

        int maxSum = Integer.MIN_VALUE;
        while (secondHalfReversedHead != null) {
            maxSum = Integer.max(maxSum, secondHalfReversedHead.val + head.val);
            secondHalfReversedHead = secondHalfReversedHead.next;
            head = head.next;
        }
        return maxSum;
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

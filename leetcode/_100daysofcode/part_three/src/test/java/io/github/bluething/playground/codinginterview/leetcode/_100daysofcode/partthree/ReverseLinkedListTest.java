package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseLinkedListTest {
    @Test
    void case01() {
        ListNode five = new ListNode(5);
        ListNode four = new ListNode(4, five);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode one = new ListNode(1, two);

        ListNode expectedOne = new ListNode(1);
        ListNode expectedTwo = new ListNode(2, expectedOne);
        ListNode expectedThree = new ListNode(3, expectedTwo);
        ListNode expectedFour = new ListNode(4, expectedThree);
        ListNode expectedFive = new ListNode(5, expectedFour);

        Assertions.assertEquals(expectedFive, reverseList(one));
    }

    ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;
        while (current != null) {
            // point to the next node
            next = current.next;
            // current = 1-2-3-4-5
            // next = 2-3-4-5
            // prev = null

            // make the node after working node link to the reversed list
            // the result is current contain reversed list (temporary)
            current.next = prev;
            // current = 1-null
            // next = 2-3-4-5
            // prev = null

            // replace prev with current
            prev = current;
            // current = 2-3-4-5
            // next = 2-3-4-5
            // prev = 1 - null

            // replace curent with next as a working node
            current = next;
            // current = 2-3-4-5
            // next = 2-3-4-5
            // prev = 1 - null
        }

        head = prev;
        return head;
    }
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

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.parttwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/reverse-linked-list/
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

    private ListNode reverseList(ListNode head) {
        return null;
    }
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
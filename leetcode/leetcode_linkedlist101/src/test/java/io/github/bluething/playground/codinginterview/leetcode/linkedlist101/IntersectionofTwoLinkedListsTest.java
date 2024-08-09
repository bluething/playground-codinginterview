package io.github.bluething.playground.codinginterview.leetcode.linkedlist101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntersectionofTwoLinkedListsTest extends ParentTest{
    @Test
    void case01() {
        ListNode _1_5 = new ListNode(5);
        ListNode _1_4_2 = new ListNode(4, _1_5);
        ListNode _1_8 = new ListNode(8, _1_4_2);
        ListNode _1_1 = new ListNode(1, _1_8);
        ListNode _1_4 = new ListNode(4, _1_1);

        ListNode _2_5_2 = new ListNode(5);
        ListNode _2_4 = new ListNode(4, _2_5_2);
        ListNode _2_8 = new ListNode(8, _2_4);
        ListNode _2_1 = new ListNode(1, _2_8);
        ListNode _2_6 = new ListNode(6, _2_1);
        ListNode _2_5 = new ListNode(5, _2_6);

        ListNode result = getIntersectionNode(_1_4, _2_5);
        printLinkedList(result);
        Assertions.assertEquals("8", output.toString());
    }
    @Test
    void case02() {
        ListNode _1_4 = new ListNode(4);
        ListNode _1_2 = new ListNode(2, _1_4);
        ListNode _1_1_2 = new ListNode(1, _1_2);
        ListNode _1_9 = new ListNode(9, _1_1_2);
        ListNode _1_1 = new ListNode(1, _1_9);

        ListNode _2_4 = new ListNode(4);
        ListNode _2_2 = new ListNode(2, _2_4);
        ListNode _2_3 = new ListNode(3, _2_2);

        ListNode result = getIntersectionNode(_1_1, _2_3);
        printLinkedList(result);
        Assertions.assertEquals("2", output.toString());
    }
    @Test
    void case03() {
        ListNode _1_4 = new ListNode(4);
        ListNode _1_6 = new ListNode(6, _1_4);
        ListNode _1_2 = new ListNode(2, _1_6);

        ListNode _2_5 = new ListNode(5);
        ListNode _2_1 = new ListNode(1, _2_5);

        ListNode result = getIntersectionNode(_1_2, _2_1);
        printLinkedList(result);
        Assertions.assertEquals("0", output.toString());
    }

    private ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        return null;
    }
}

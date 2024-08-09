package io.github.bluething.playground.codinginterview.leetcode.linkedlist101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OddEvenLinkedListTest extends ParentTest {
    @Test
    void case01() {
        ListNode _5 = new ListNode(5);
        ListNode _4 = new ListNode(4, _5);
        ListNode _3 = new ListNode(3, _4);
        ListNode _2 = new ListNode(2, _3);
        ListNode _1 = new ListNode(1, _2);

        ListNode result = oddEvenList(_1);
        printLinkedList(result);
        Assertions.assertEquals("13524", output.toString());
    }
    @Test
    void case02() {
        ListNode _7 = new ListNode(7);
        ListNode _4 = new ListNode(4, _7);
        ListNode _6 = new ListNode(6, _4);
        ListNode _5 = new ListNode(5, _6);
        ListNode _3 = new ListNode(3, _5);
        ListNode _1 = new ListNode(1, _3);
        ListNode _2= new ListNode(2, _1);

        ListNode result = oddEvenList(_1);
        printLinkedList(result);
        Assertions.assertEquals("2367154", output.toString());
    }

    private ListNode oddEvenList(ListNode head) {
        return null;
    }
}

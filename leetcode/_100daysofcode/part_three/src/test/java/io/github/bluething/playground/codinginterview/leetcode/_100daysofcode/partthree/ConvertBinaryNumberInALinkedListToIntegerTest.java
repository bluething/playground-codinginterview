package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
class ConvertBinaryNumberInALinkedListToIntegerTest {
    @Test
    void case01() {
        ListNode node3 = new ListNode(1);
        ListNode node2 = new ListNode(0, node3);
        ListNode node1 = new ListNode(1, node2);
        Assertions.assertEquals(5, getDecimalValue(node1));
    }

    @Test
    void case02() {
        ListNode node = new ListNode(0);
        Assertions.assertEquals(0, getDecimalValue(node));
    }

    // analogy, convert 1-2-3-4 to decimal, let say we have ans=0
    // step 1 -> ans*10^1 + 1 = 1
    // step 2 - > 1*10 + 2 = 12
    // step 3 -> 12*10 + 3 = 123
    // step 4 -> 123*10 + 4 = 1234
    // in decimal, we multiply by 2
    // 1-0-1, let say we have ans=0
    // step 1 -> 1 (ans*2^1) + 1 = 1
    // step 2 -> ans*2^1 (1*2^1) + 0 = 2
    // step 3 -> ans*2^1 + 1 = 5
    // digit << 1 == digit * 2^1
    private int getDecimalValue(ListNode head) {
        int ans = 0;
        while (head != null) {
            ans = (ans << 1) + head.val;
            head = head.next;
        }
        return ans;
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

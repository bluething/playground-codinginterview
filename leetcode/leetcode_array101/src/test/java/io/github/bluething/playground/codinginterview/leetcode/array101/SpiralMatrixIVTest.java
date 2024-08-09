package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SpiralMatrixIVTest {
    @Test
    void case01() {
        ListNode _02 = new ListNode(0);
        ListNode _52 = new ListNode(5, _02);
        ListNode _5 = new ListNode(5, _52);
        ListNode _22 = new ListNode(2, _5);
        ListNode _4 = new ListNode(4, _22);
        ListNode _9 = new ListNode(9, _4);
        ListNode _7 = new ListNode(7, _9);
        ListNode _1 = new ListNode(1, _7);
        ListNode _8 = new ListNode(8, _1);
        ListNode _6 = new ListNode(6, _8);
        ListNode _2 = new ListNode(2, _6);
        ListNode _0 = new ListNode(0, _2);
        ListNode _3 = new ListNode(3, _0);
        Assertions.assertArrayEquals(new int[][]{{3,0,2,6,8},{5,0,-1,-1,1},{5,2,4,9,7}}, spiralMatrix(3, 5, _3));
    }
    @Test
    void case02() {
        ListNode _2 = new ListNode(2);
        ListNode _1 = new ListNode(1, _2);
        ListNode _0 = new ListNode(0, _1);
        Assertions.assertArrayEquals(new int[][]{{0,1,2,-1}}, spiralMatrix(1, 4, _0));
    }

    private int[][] spiralMatrix(int m, int n, ListNode head) {
        return new int[][]{};
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

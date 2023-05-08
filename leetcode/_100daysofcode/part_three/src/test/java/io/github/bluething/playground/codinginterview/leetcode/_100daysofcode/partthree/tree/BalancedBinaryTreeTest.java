package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/balanced-binary-tree/
class BalancedBinaryTreeTest {

    @Test
    void case01() {
        TreeNode input15 = new TreeNode(15);
        TreeNode input7 = new TreeNode(7);
        TreeNode input20 = new TreeNode(20, input15, input7);
        TreeNode input9 = new TreeNode(9);
        TreeNode input3 = new TreeNode(3, input9, input20);

        Assertions.assertTrue(isBalanced(input3));
    }

    @Test
    void case02() {
        TreeNode input41 = new TreeNode(4);
        TreeNode input42 = new TreeNode(4);
        TreeNode input31 = new TreeNode(3, input41, input42);
        TreeNode input32 = new TreeNode(3);
        TreeNode input21 = new TreeNode(2, input31, input32);
        TreeNode input22 = new TreeNode(2);
        TreeNode input1 = new TreeNode(2, input21, input22);

        Assertions.assertFalse(isBalanced(input1));
    }

    @Test
    void case03() {
        Assertions.assertTrue(isBalanced(null));
    }

    private boolean isBalanced(TreeNode root) {
        return true;
    }

    class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.value = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.value = val;
            this.left = left;
            this.right = right;
        }
    }
}

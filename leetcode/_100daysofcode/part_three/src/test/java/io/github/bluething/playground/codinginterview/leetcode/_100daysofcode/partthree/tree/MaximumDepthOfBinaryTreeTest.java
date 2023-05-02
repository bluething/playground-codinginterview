package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/
class MaximumDepthOfBinaryTreeTest {

    @Test
    void case01() {
        TreeNode input7 = new TreeNode(9);
        TreeNode input15 = new TreeNode(6);
        TreeNode input20 = new TreeNode(7, input15, input7);
        TreeNode input9 = new TreeNode(1);
        TreeNode input3 = new TreeNode(3, input9, input20);
        Assertions.assertEquals(3, maxDepth(input3));
    }

    private int maxDepth(TreeNode root) {
        return 0;
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

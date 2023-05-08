package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/diameter-of-binary-tree/
class DiameterOfBinaryTreeTest {

    @Test
    void case01() {
        TreeNode inputFour = new TreeNode(4);
        TreeNode inputFive = new TreeNode(5);
        TreeNode inputTwo = new TreeNode(2, inputFour, inputFive);
        TreeNode inputThree = new TreeNode(3);
        TreeNode inputOne = new TreeNode(1, inputTwo, inputThree);

        Assertions.assertEquals(3, diameterOfBinaryTree(inputOne));
    }

    @Test
    void case02() {
        TreeNode inputTwo = new TreeNode(2);
        TreeNode inputOne = new TreeNode(1, inputTwo, null);

        Assertions.assertEquals(1, diameterOfBinaryTree(inputOne));

    }

    private int diameterOfBinaryTree(TreeNode root) {
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

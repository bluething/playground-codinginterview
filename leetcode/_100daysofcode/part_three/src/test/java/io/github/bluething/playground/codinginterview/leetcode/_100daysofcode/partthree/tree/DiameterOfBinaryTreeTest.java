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
        if (root == null) {
            return 0;
        }
        int[] diameter = new int[1];
        height(root, diameter);
        return diameter[0];
    }

    // dfs
    // for each node we need to know the height
    // then we can calculate the diameter
    private int height(TreeNode root, int[] diameter) {
        if (root == null) {
            return -1;
        }

        // go to the left
        int leftHeight = height(root.left, diameter);
        // got to the right
        int rightHeight = height(root.right, diameter);

        // the formula to calculate diameter is leftHeight + rightHeight + 2
        // why +2 is because we have 2 legs
        // the convention is when we see null, we return -1 as a height
        diameter[0] = Math.max(diameter[0], (leftHeight + rightHeight + 2));

        // formula to calculate height of tree
        return 1 + Math.max(leftHeight, rightHeight);
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

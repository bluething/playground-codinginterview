package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

// https://leetcode.com/problems/invert-binary-tree/
class InvertBinaryTreeTest {

    @Test
    void case01() {
        TreeNode inputNine = new TreeNode(9);
        TreeNode inputSix = new TreeNode(6);
        TreeNode inputSeven = new TreeNode(7, inputSix, inputNine);
        TreeNode inputOne = new TreeNode(1);
        TreeNode inputThree = new TreeNode(3);
        TreeNode inputTwo = new TreeNode(2, inputOne, inputThree);
        TreeNode inputFour = new TreeNode(4, inputTwo, inputSeven);

        TreeNode outputNine = new TreeNode(9);
        TreeNode outputSix = new TreeNode(6);
        TreeNode outputSeven = new TreeNode(7, outputNine, outputSix);
        TreeNode outputOne = new TreeNode(1);
        TreeNode outputThree = new TreeNode(3);
        TreeNode outputTwo = new TreeNode(2, outputOne, outputThree);
        TreeNode outputFour = new TreeNode(4, outputSeven, outputTwo);

        Assertions.assertEquals(outputFour.left.value, invertTree(inputFour).left.value);

    }

    @Test
    void case02() {
        TreeNode inputNine = new TreeNode(9);
        TreeNode inputSix = new TreeNode(6);
        TreeNode inputSeven = new TreeNode(7, inputSix, inputNine);
        TreeNode inputOne = new TreeNode(1);
        TreeNode inputThree = new TreeNode(3);
        TreeNode inputTwo = new TreeNode(2, inputOne, inputThree);
        TreeNode inputFour = new TreeNode(4, inputTwo, inputSeven);

        TreeNode outputNine = new TreeNode(9);
        TreeNode outputSix = new TreeNode(6);
        TreeNode outputSeven = new TreeNode(7, outputNine, outputSix);
        TreeNode outputOne = new TreeNode(1);
        TreeNode outputThree = new TreeNode(3);
        TreeNode outputTwo = new TreeNode(2, outputOne, outputThree);
        TreeNode outputFour = new TreeNode(4, outputSeven, outputTwo);

        Assertions.assertEquals(outputFour.left.value, invertTreeIterative(inputFour).left.value);

    }

    private TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // switch
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // call recursively
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    private TreeNode invertTreeIterative(TreeNode root) {
        if (root == null) {
            return null;
        }

        Stack<TreeNode> nodes = new Stack<>();
        nodes.push(root);
        TreeNode temp = null;
        while (!nodes.isEmpty()) {
            temp = nodes.pop();
            if (temp != null) {
                nodes.push(temp.left);
                nodes.push(temp.right);

                temp = root.left;
                root.left = root.right;
                root.right = temp;
            }
        }
        return root;
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

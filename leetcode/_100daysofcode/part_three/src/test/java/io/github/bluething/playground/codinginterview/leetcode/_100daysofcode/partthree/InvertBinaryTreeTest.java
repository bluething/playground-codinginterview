package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        return null;
    }

    private TreeNode invertTreeIterative(TreeNode root) {
        return null;
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

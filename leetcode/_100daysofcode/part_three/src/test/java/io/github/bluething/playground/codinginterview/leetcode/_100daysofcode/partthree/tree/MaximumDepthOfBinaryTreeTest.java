package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

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

    @Test
    void case02() {
        TreeNode input7 = new TreeNode(9);
        TreeNode input15 = new TreeNode(6);
        TreeNode input20 = new TreeNode(7, input15, input7);
        TreeNode input9 = new TreeNode(1);
        TreeNode input3 = new TreeNode(3, input9, input20);
        Assertions.assertEquals(3, maxDepth2(input3));
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    // using bfs
    private int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Stack<TreeNode> nodes = new Stack<>();
        nodes.push(root);
        TreeNode node = null;
        // track max depth
        int max = 0;
        // track max depth per node
        // grow with nodes
        Stack<Integer> counters = new Stack<>();
        counters.push(1);
        int counter = 0;
        while (!nodes.isEmpty()) {
            node = nodes.pop();
            counter = counters.pop();
            max = Math.max(max, counter);

            // put each child to the queue and increase counter (also put to counter queue)
            if (node.left != null) {
                nodes.push(node.left);
                counters.push(1 + counter);
            }
            if (node.right != null) {
                nodes.push(node.right);
                counters.push(1 + counter);
            }
        }

        return max;
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

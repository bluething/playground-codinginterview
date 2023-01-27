package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ConvertSortedArrayToBinarySearchTreeTest {

    @Test
    public void case01() {
        TreeNode minus10 = new TreeNode(-10);
        TreeNode minus3 = new TreeNode(-3, minus10, null);
        TreeNode five = new TreeNode(5);
        TreeNode nine = new TreeNode(9, five, null);
        TreeNode zero = new TreeNode(0, minus3, nine);
        List<Integer> expected = inorderTraversal(zero);
        List<Integer> actual = inorderTraversal(sortedArrayToBST(new int[]{-10,-3,0,5,9}));
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void case02() {
        TreeNode one = new TreeNode(1);
        TreeNode three = new TreeNode(3, one, null);
        List<Integer> expected = inorderTraversal(three);
        List<Integer> actual = inorderTraversal(sortedArrayToBST(new int[]{1,3}));
        Assertions.assertEquals(expected, actual);
    }

    private TreeNode sortedArrayToBST(int[] nums) {
        return null;
    }

    private List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> values = new ArrayList<>();
        root.inorderTraversalRecursion(root, values);

        return values;
    }

    class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode() {

        }

        TreeNode(int value) {
            this(value, null, null);
        }

        TreeNode(int value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public void inorderTraversalRecursion(TreeNode treeNode, List<Integer> result) {
            if (treeNode != null) {
                inorderTraversalRecursion(treeNode.left, result);
                result.add(treeNode.value);
                inorderTraversalRecursion(treeNode.right, result);
            }
        }
    }
}

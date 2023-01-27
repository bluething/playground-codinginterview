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
        return createBST(nums, 0, nums.length-1);
    }

    private TreeNode createBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        // because nums already sort by asc, we need to find the middle element as a root
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        // for left side we start over from left until mid-1
        root.left = createBST(nums, left, mid-1);
        // for right side we start over from m+1 until right
        root.right = createBST(nums, mid+1, right);
        return root;

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

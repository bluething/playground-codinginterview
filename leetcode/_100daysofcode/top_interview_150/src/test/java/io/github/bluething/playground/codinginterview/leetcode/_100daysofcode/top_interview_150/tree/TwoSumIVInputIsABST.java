package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/
class TwoSumIVInputIsABST {

    @Test
    void case01() {
        TreeNode _7 = new TreeNode(7);
        TreeNode _6 = new TreeNode(6, null, _7);
        TreeNode _4 = new TreeNode(4);
        TreeNode _2 = new TreeNode(2);
        TreeNode _3 = new TreeNode(3, _2, _4);
        TreeNode _5 = new TreeNode(5, _3, _6);

        Assertions.assertTrue(findTarget(_5, 9));
    }

    @Test
    void case02() {
        TreeNode _7 = new TreeNode(7);
        TreeNode _6 = new TreeNode(6, null, _7);
        TreeNode _4 = new TreeNode(4);
        TreeNode _2 = new TreeNode(2);
        TreeNode _3 = new TreeNode(3, _2, _4);
        TreeNode _5 = new TreeNode(5, _3, _6);

        Assertions.assertFalse(findTarget(_5, 28));
    }

    @Test
    void case03() {
        TreeNode _7 = new TreeNode(7);
        TreeNode _6 = new TreeNode(6, null, _7);
        TreeNode _4 = new TreeNode(4);
        TreeNode _2 = new TreeNode(2);
        TreeNode _3 = new TreeNode(3, _2, _4);
        TreeNode _5 = new TreeNode(5, _3, _6);

        Assertions.assertTrue(findTarget2(_5, 9));
    }

    @Test
    void case04() {
        TreeNode _7 = new TreeNode(7);
        TreeNode _6 = new TreeNode(6, null, _7);
        TreeNode _4 = new TreeNode(4);
        TreeNode _2 = new TreeNode(2);
        TreeNode _3 = new TreeNode(3, _2, _4);
        TreeNode _5 = new TreeNode(5, _3, _6);

        Assertions.assertFalse(findTarget2(_5, 28));
    }

    @Test
    void case05() {
        TreeNode _3 = new TreeNode(3);
        TreeNode _1 = new TreeNode(1);
        TreeNode _2 = new TreeNode(2, _1, _3);

        Assertions.assertTrue(findTarget2(_2, 4));
    }

    Set<Integer> nums = new HashSet<>();

    private boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }

        if (nums.contains(k - root.value)) {
            return true;
        }
        nums.add(root.value);

        return findTarget(root.left, k) || findTarget(root.right, k);
    }

    // using 2 recursive function
    // recursive() drive the search using dfs
    // find() try to find matching candidate (k - currentNode.value), start from root
    // using dfs
    // we need to pass currentNode because we don't want to match with the root node itself
    private boolean findTarget2(TreeNode root, int k) {
        return recursive(root, root, k);
    }

    private boolean recursive(TreeNode root, TreeNode currentNode, int k) {
        if (currentNode == null) {
            return false;
        }

        if (find(root, k - currentNode.value, currentNode)) {
            return true;
        }

        return recursive(root, currentNode.left, k) || recursive(root, currentNode.right, k);
    }

    private boolean find(TreeNode root, int val, TreeNode currentNode) {
        if (root == null) {
            return false;
        }

        if (root.value > val) {
            return find(root.left, val, currentNode);
        } else if (root.value < val) {
            return find(root.right, val, currentNode);
        } else {
            return root != currentNode;
        }
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

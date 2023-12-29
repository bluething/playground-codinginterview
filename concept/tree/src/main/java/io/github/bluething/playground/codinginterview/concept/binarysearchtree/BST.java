package io.github.bluething.playground.codinginterview.concept.binarysearchtree;

import java.util.NoSuchElementException;

public class BST {
    protected BSTVertex root;

    public BST() {
        root = null;
    }

    protected BSTVertex search(BSTVertex T, int v) {
        if (T == null) {
            return null;
        } else if (T.key == v) {
            return T;
        } else if (T.key < v) {
            return search(T.right, v);
        } else {
            return search(T.left, v);
        }
    }
    public int search(int v) {
        BSTVertex T = search(root, v);
        return T == null ? -1 : T.key;
    }

    protected BSTVertex insert(BSTVertex T, int v) {
        if (T == null) {
            return new BSTVertex(v);    // found insertion position
        }

        if (T.key < v) {    // go right
            T.right = insert(T.right, v);
            T.right.parent = T;
        } else {            // go left
            T.left = insert(T.left, v);
            T.left.parent = T;
        }

        return T;   // return the updated BST
    }
    public void insert(int v) {
        root = insert(root, v);
    }

    protected void inOrder(BSTVertex T) {
        if (T == null) {
            return;
        }

        inOrder(T.left);
        System.out.printf(" %d", T.key);
        inOrder(T.right);
    }
    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    // go to the lowest node on the left
    protected int findMin(BSTVertex T) {
        if (T == null) {
            throw new NoSuchElementException("BST is empty, no minimum");
        }

        if (T.left == null) {
            return T.key;
        } else {
            return findMin(T.left);
        }
    }
    public int findMin() {
        return findMin(root);
    }

    // go to the lowest node on the right
    protected int findMax(BSTVertex T) {
        if (T == null) {
            throw new NoSuchElementException("BST is empty, no minimum");
        }

        if (T.right == null) {
            return T.key;
        } else {
            return findMax(T.right);
        }
    }
    public int findMax() {
        return findMax(root);
    }

    protected int successor(BSTVertex T) {
        if (T.right != null) {
            return findMin(T.right);    // find min from the right subtree
        } else {    // if don't have right subtree move up until the parent is root or the parent is a left child of the grandparent
            BSTVertex parent = T.parent;
            BSTVertex current = T;
            while (parent != null && current == parent.right) { // loop while parent not a root and current is the right child
                current = parent;   // move up
                parent = current.parent;
            }

            return parent == null ? -1 : parent.key;
        }
    }
    public int successor(int v) {
        BSTVertex T = search(root, v);
        return T == null ? -1 : successor(T);
    }

    protected int predecessor(BSTVertex T) {
        if (T.left != null) {
            return findMax(T.left);    // find max from the left subtree
        } else {    // if don't have left subtree move up until the parent is root or the parent is a right child of the grandparent
            BSTVertex parent = T.parent;
            BSTVertex current = T;
            while (parent != null && current == parent.left) { // loop while parent not a root and current is the left child
                current = parent;   // move up
                parent = current.parent;
            }

            return parent == null ? -1 : parent.key;
        }
    }
    public int predecessor(int v) {
        BSTVertex T = search(root, v);
        return T == null ? -1 : predecessor(T);
    }

    protected BSTVertex delete(BSTVertex T, int v) {
        if (T == null) {
            return null;
        }

        if (T.key == v) {
            if (T.left == null && T.right == null) {
                T = null;
            } else if (T.left == null && T.right != null) { // only have right children
                T.right.parent = T.parent;
                T = T.right;
            } else if (T.left != null && T.right == null) { // only have left children
                T.left.parent = T.parent;
                T = T.left;
            } else {    // has two children, find successor to avoid quarrel
                int successor = successor(v);   // can use predecessor also
                T.key = successor;              // replace the value with the successor
                T.right = delete(T.right, successor);   // delete the old successor
            }
        } else if (T.key < v) { // go to the right
            T.right = delete(T.right, v);
        } else {                // go to the left
            T.left = delete(T.left, v);
        }

        return T;
    }
    public void delete(int v) {
        root = delete(root, v);
    }

    // for AVL
    protected int getHeight(BSTVertex T) {
        if (T == null) {
            return -1;
        }
        else return Math.max(getHeight(T.left), getHeight(T.right)) + 1;
    }

    public int getHeight() {
        return getHeight(root);
    }
}

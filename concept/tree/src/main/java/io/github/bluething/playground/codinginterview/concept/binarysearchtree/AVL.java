package io.github.bluething.playground.codinginterview.concept.binarysearchtree;

public class AVL extends BST {
    public AVL() {
        root = null;
    }

    private int h(BSTVertex T) {
        return T == null ? -1 : T.height;
    }

    protected BSTVertex rotateLeft(BSTVertex T) {
        BSTVertex w = T.right;  // T must have a right child
        w.parent = T.parent;
        T.parent = w;
        T.right = w.left;
        if (w.left != null) {
            w.left.parent = T;
        }
        w.left = T;

        T.height = Math.max(h(T.left), h(T.right)) + 1;
        w.height = Math.max(h(w.left), h(w.right)) + 1;

        return w;
    }

    protected BSTVertex rotateRight(BSTVertex T) {
        BSTVertex w = T.left;   // T must have a left child
        w.parent = T.parent;
        T.parent = w;
        T.left = w.right;
        if (w.right != null) {
            w.right.parent = T;
        }
        w.right = T;

        T.height = Math.max(h(T.left), h(T.right)) + 1;
        w.height = Math.max(h(w.left), h(w.right)) + 1;

        return w;
    }

    protected BSTVertex insert(BSTVertex T, int v) {
        if (T == null) {
            return new BSTVertex(v);
        }

        if (T.key < v) {
            T.right = insert(T.right, v);
            T.right.parent = T;
        } else {
            T.left = insert(T.left, v);
            T.left.parent = T;
        }

        // balancing
        int balance = h(T.left) - h(T.right);
        if (balance == 2) { // left heavy
            int balance2 = h(T.left.left) - h(T.left.right);
            if (balance2 == 1) {
                T = rotateRight(T);
            } else {    // -1
                T.left = rotateLeft(T.left);
                T = rotateRight(T);
            }
        } else if (balance == -2) { // right heavy
            int balance2 = h(T.right.left) - h(T.right.right);
            if (balance2 == -1) {
                T = rotateLeft(T);
            } else {    // 1
                T.right = rotateRight(T.right);
                T = rotateLeft(T);
            }
        }

        T.height = Math.max(h(T.left), h(T.right)) + 1;
        return T;
    }

    protected BSTVertex delete(BSTVertex T, int v) {
        if (T == null) {
            return null;
        }

        if (T.key == v) {
            if (T.left == null && T.right == null) {
                T = null;
            } else if (T.left == null && T.right != null) { // only have one right children
                BSTVertex temp = T;
                T.right.parent = T.parent;
                T = T.right;                                                 // bypass T
                temp = null;
            } else if (T.left != null && T.right == null) { // only have one left children
                BSTVertex temp = T;
                T.left.parent = T.parent;
                T = T.left;                                                  // bypass T
                temp = null;
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

        if (T != null) {
            int balance = h(T.left) - h(T.right);
            if (balance == 2) { // left heavy
                int balance2 = h(T.left.left) - h(T.left.right);
                if (balance2 == 1) {
                    T = rotateRight(T);
                } else {    // -1
                    T.left = rotateLeft(T.left);
                    T = rotateRight(T);
                }
            } else if (balance == -2) { // right heavy
                int balance2 = h(T.right.left) - h(T.right.right);
                if (balance2 == -1) {
                    T = rotateLeft(T);
                } else {    // 1
                    T.right = rotateRight(T.right);
                    T = rotateLeft(T);
                }
            }

            T.height = Math.max(h(T.left), h(T.right)) + 1;
        }


        return T;

    }
}

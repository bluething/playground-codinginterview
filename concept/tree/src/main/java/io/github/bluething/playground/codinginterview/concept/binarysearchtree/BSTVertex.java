package io.github.bluething.playground.codinginterview.concept.binarysearchtree;

public class BSTVertex {
    public BSTVertex parent, left, right;
    public int key;
    public int height;

    BSTVertex(int v) {
        key = v;
        parent = left = right = null;
        height = 0;
    }
}

package io.github.bluething.playground.codinginterview.concept.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryHeap {
    private final List<Integer> compactArray;
    private int size;

    private int parent(int i) {
        return i >> 1;
    }
    private int leftChild(int i) {
        return i << 1;
    }
    private int rightChild(int i) {
        return (i << 1) + 1;
    }

    public BinaryHeap() {
        compactArray = new ArrayList<>();
        compactArray.add(-1);
        size = 0;
    }

    private void swap(int i, int j) {
        int tmp = compactArray.get(i);
        compactArray.set(i, compactArray.get(j));
        compactArray.set(j, tmp);
    }
    private void shiftDown(int i) {
        if (i > size) {
            return;
        }

        int swapId = i;
        // compare with left child
        if (leftChild(i) <= size && compactArray.get(i) < compactArray.get(leftChild(i))) {
            swapId = leftChild(i);
        }
        // compare with right child
        if (rightChild(i) <= size && compactArray.get(swapId) < compactArray.get(rightChild(i))) {
            swapId = rightChild(i);
        }
        if (swapId != i) {
            swap(i, swapId);
            shiftDown(swapId);
        }
    }
    public void shiftUp(int i) {
        if (i == 1) {
            return;
        }

        if (compactArray.get(i) > compactArray.get(parent(i))) {
            swap(i, parent(i));
            shiftUp(parent(i));
        }
    }

    public int peek() {
        return compactArray.get(1);
    }
    public int poll() {
        int root = compactArray.get(1);
        // swap with last node
        swap(1, size--);
        // fix the heap
        shiftDown(1);
        return root;
    }
    public void offer(int val) {
        if (compactArray.size() + 1 >= compactArray.size()) {
            compactArray.add(0);
        }
        compactArray.set(++size, val);
        shiftUp(size);
    }
    public boolean isEmpty() {
        return size == 0;
    }
}

package io.github.bluething.playground.codinginterview.concept;

import io.github.bluething.playground.codinginterview.concept.tree.BinaryHeap;

import java.io.PrintWriter;

public class BinaryHeapMain {
    public static void main(String[] args) {
        PrintWriter writer = new PrintWriter(System.out);

        BinaryHeap pq = new BinaryHeap();
        pq.offer(1);
        pq.offer(2);
        pq.offer(3);
        pq.offer(4);
        pq.offer(5);
        pq.offer(6);
        pq.offer(7);
        while (!pq.isEmpty()) {
            writer.println(pq.poll());
        }

        writer.close();
    }
}

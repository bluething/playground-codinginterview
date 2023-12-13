package io.github.bluething.playground.codinginterview.concept;

import io.github.bluething.playground.codinginterview.concept.tree.UnionFind;

import java.io.PrintWriter;

public class UnionFindMain {
    public static void main(String[] args) {
        PrintWriter writer = new PrintWriter(System.out);
        writer.println("Assume that there are 5 disjoint sets initially\n");
        UnionFind unionFind = new UnionFind(5);
        writer.printf("%d\n", unionFind.numDisjointSets());

        unionFind.unionSet(0, 1);
        writer.printf("%d\n", unionFind.numDisjointSets());

        unionFind.unionSet(2, 3);
        writer.printf("%d\n", unionFind.numDisjointSets());

        unionFind.unionSet(4, 3);
        writer.printf("%d\n", unionFind.numDisjointSets());

        writer.printf("isSameSet(0, 3) = %b\n", unionFind.isSameSet(0, 3)); // false
        writer.printf("isSameSet(4, 3) = %b\n", unionFind.isSameSet(4, 3)); // true

        for (int i = 0; i < 5; i++) {
            writer.printf("findSet(%d) = %d, sizeOfSet(%d) = %d\n", i, unionFind.findSet(i), i, unionFind.sizeOfSet(i));
        }

        unionFind.unionSet(0, 3);
        writer.printf("%d\n", unionFind.numDisjointSets());

        for (int i = 0; i < 5; i++) {
            writer.printf("findSet(%d) = %d, sizeOfSet(%d) = %d\n", i, unionFind.findSet(i), i, unionFind.sizeOfSet(i));
        }

        writer.close();
    }
}

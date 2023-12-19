package io.github.bluething.playground.codinginterview.concept;

import io.github.bluething.playground.codinginterview.concept.tree.FenwickTree;

import java.io.PrintWriter;

public class FenwickTreeMain {
    public static void main(String[] args) {
        PrintWriter writer = new PrintWriter(System.out);
        FenwickTree fenwickTree = new FenwickTree(10);
        fenwickTree.update(2, 1);   // {-,0,1,0,1,0,0,0, 1,0,0}, idx 2,4,8 => +1
        fenwickTree.update(4, 1);   // {-,0,1,0,2,0,0,0, 2,0,0}, idx 4,8 => +1
        fenwickTree.update(5, 2);   // {-,0,1,0,2,2,2,0, 4,0,0}, idx 5,6,8 => +2
        fenwickTree.update(6, 3);   // {-,0,1,0,2,2,5,0, 7,0,0}, idx 6,8 => +3
        fenwickTree.update(7, 2);   // {-,0,1,0,2,2,5,2, 9,0,0}, idx 7,8 => +2
        fenwickTree.update(8, 1);   // {-,0,1,0,2,2,5,2,10,0,0}, idx 8 => +1
        fenwickTree.update(9, 1);   // {-,0,1,0,2,2,5,2,10,1,1}

        writer.printf("%d\n", fenwickTree.rsq(1, 1));
        writer.printf("%d\n", fenwickTree.rsq(1, 2));   // 1 => ft[2] = 1
        writer.printf("%d\n", fenwickTree.rsq(1, 6));   // 7 => ft[6] + ft[4] = 5 + 2 = 7
        writer.printf("%d\n", fenwickTree.rsq(1, 10));  // 11 => ft[10] + ft[8] = 1 + 10 = 11
        writer.printf("%d\n", fenwickTree.rsq(3, 6));   // 6 => rsq(1, 6) - rsq(1, 2) = 7 - 1

        fenwickTree.update(5, 2);
        writer.printf("%d\n", fenwickTree.rsq(1, 10));

        writer.close();
    }
}

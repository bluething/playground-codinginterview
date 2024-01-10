package io.github.bluething.playground.codinginterview.concept;

import io.github.bluething.playground.codinginterview.concept.map.LinearProbingHashMap;

public class LinearProbingHashMapMain {
    public static void main(String[] args) {
        LinearProbingHashMap map = new LinearProbingHashMap();

        map.insert(1, "a");
        map.insert(2, "b");
        map.insert(3, "c");

        System.out.printf("Key:%d value:%s%n", 1, map.search(1));

        for (int i = 4; i < 32; i++) {
            map.insert(i, 'a' + i);
        }
        System.out.printf("Key:%d value:%s%n", 31, map.search(31));

        map.remove(1);
        System.out.printf("Key:%d value:%s%n", 1, map.search(1));
    }
}

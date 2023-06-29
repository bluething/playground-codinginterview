package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

// https://leetcode.com/problems/design-hashset/description/
class DesignHashSetTest {

    @Test
    void case01() {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(2);
        Assertions.assertTrue(myHashSet.contains(1));
        Assertions.assertFalse(myHashSet.contains(3));
        myHashSet.add(2);
        Assertions.assertTrue(myHashSet.contains(2));
        myHashSet.remove(2);
        Assertions.assertFalse(myHashSet.contains(2));
    }

    @Test
    void case02() {
        MyHashSet2 myHashSet = new MyHashSet2();
        myHashSet.add(1);
        myHashSet.add(2);
        Assertions.assertTrue(myHashSet.contains(1));
        Assertions.assertFalse(myHashSet.contains(3));
        myHashSet.add(2);
        Assertions.assertTrue(myHashSet.contains(2));
        myHashSet.remove(2);
        Assertions.assertFalse(myHashSet.contains(2));
    }


    // use too many memory
    class MyHashSet {

        private final boolean[] arr;

        public MyHashSet() {
            arr = new boolean[1000001];
        }

        public void add(int key) {
            arr[key] = true;
        }

        public void remove(int key) {
            arr[key] = false;
        }

        public boolean contains(int key) {
            return arr[key];
        }
    }

    class MyHashSet2 {

        // instead of use array of size N, we can reduce the number with bucket
        // then use modulo to find the right bucket for each key
        // we use LinkedList as an array type to easily handle collision
        // 1001 and 1 will go to 2nd bucket with different nodes
        private final LinkedList<Integer>[] buckets;
        private final int bucketSize = 1000;

        public MyHashSet2() {
            buckets = new LinkedList[bucketSize];
        }

        private int getBucket(int key) {
            return key % bucketSize;
        }

        public void add(int key) {
            // hashset can't contain duplicate
            if (!contains(key)) {
                int bucketId = getBucket(key);
                if (buckets[bucketId] == null) {
                    buckets[bucketId] = new LinkedList<>();
                }
                buckets[bucketId].addLast(key);
            }
        }

        public void remove(int key) {
            int bucketId = getBucket(key);
            if (buckets[bucketId] != null) {
                buckets[bucketId].removeFirstOccurrence(key);
            }
        }

        public boolean contains(int key) {
            int bucketId = getBucket(key);
            if (buckets[bucketId] != null) {
                return buckets[bucketId].contains(key);
            }

            return false;
        }
    }
}

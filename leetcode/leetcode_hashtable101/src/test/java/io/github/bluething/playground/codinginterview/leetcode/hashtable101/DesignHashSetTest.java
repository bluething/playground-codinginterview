package io.github.bluething.playground.codinginterview.leetcode.hashtable101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DesignHashSetTest {

    @Test
    void case01() {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);
        hashSet.add(2);
        Assertions.assertTrue(hashSet.contains(1));
        Assertions.assertFalse(hashSet.contains(3));
        hashSet.add(2);
        Assertions.assertTrue(hashSet.contains(2));
        hashSet.remove(2);
        Assertions.assertFalse(hashSet.contains(2));
    }

    class MyHashSet {

        public MyHashSet() {

        }

        public void add(int key) {

        }

        public void remove(int key) {

        }

        public boolean contains(int key) {

        }
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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


    // use too many memory
    class MyHashSet {

        private final boolean[] arr;

        public MyHashSet() {
            arr = new boolean[1000001];
            Arrays.fill(arr, false);
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
}

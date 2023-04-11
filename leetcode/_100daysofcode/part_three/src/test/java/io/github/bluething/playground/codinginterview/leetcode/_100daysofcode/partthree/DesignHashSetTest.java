package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

// https://leetcode.com/problems/design-hashset/
class DesignHashSetTest {

    class MyHashSet {

        private boolean[] data;

        public MyHashSet() {
            data = new boolean[(int) (Math.pow(10,6)+1)];
        }

        public void add(int key) {
            data[key] = true;
        }

        public void remove(int key) {
            data[key] = false;
        }

        public boolean contains(int key) {
            return data[key];
        }
    }
}

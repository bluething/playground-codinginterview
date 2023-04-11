package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import java.util.LinkedList;

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

    class MyHashSet2 {

        class Node {
            Node next;
            int val;
            public Node(int key) {
                this.val = key;
                this.next = null;
            }
        }

        Node head;

        public MyHashSet2() {
            head = null;
        }

        public void add(int key) {
            if (head == null) {
                head = new Node(key);
                return;
            }

            boolean isExist = contains(key);
            if (!isExist) {
                Node tmp = head;
                while (tmp.next != null) {
                    tmp = tmp.next;
                }
                tmp.next = new Node(key);
            }
        }

        public void remove(int key) {
            if (head == null) {
                return;
            }
            if (head.val == key) {
                head = head.next;
                return;
            }
            Node tmp = head;
            while (tmp.next != null) {
                if (tmp.next.val == key) {
                    tmp.next = tmp.next.next;
                } else {
                    tmp = tmp.next;
                }
            }
        }

        public boolean contains(int key) {
            if (head == null) {
                return false;
            }
            if (head.val == key) {
                return true;
            }
            Node tmp = head;
            while (tmp.next != null) {
                if (tmp.next.val == key) {
                    return true;
                } else {
                    tmp = tmp.next;
                }
            }

            return false;
        }
    }

    class MyHashSet3 {

        private final int bucketSize = 10;
        private LinkedList<Integer>[] buckets;

        public MyHashSet3() {
            buckets = new LinkedList[bucketSize];
        }

        private int getBucket(int key) {
            return key % bucketSize;
        }

        public void add(int key) {
            if (!contains(key)) {
                int bucketId = getBucket(key);
                if (buckets[bucketId] == null) {
                    LinkedList<Integer> bucket = new LinkedList<>();
                    bucket.addLast(key);
                    buckets[bucketId] = bucket;
                } else {
                    buckets[bucketId].addLast(key);
                }
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
                if (buckets[bucketId].contains(key)) {
                    return true;
                }

                return false;
            }

            return false;
        }
    }
}

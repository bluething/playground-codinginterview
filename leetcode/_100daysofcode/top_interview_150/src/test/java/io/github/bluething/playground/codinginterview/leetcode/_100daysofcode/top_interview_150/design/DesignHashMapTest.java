package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

// https://leetcode.com/problems/design-hashmap/description/
class DesignHashMapTest {

    @Test
    void case01() {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1, 1);
        myHashMap.put(2, 2);
        Assertions.assertEquals(1, myHashMap.get(1));
        Assertions.assertEquals(-1, myHashMap.get(3));
        myHashMap.put(2, 1);
        Assertions.assertEquals(1, myHashMap.get(2));
        myHashMap.remove(2);
        Assertions.assertEquals(-1, myHashMap.get(2));
    }

    @Test
    void case02() {
        MyHashMap2 myHashMap = new MyHashMap2();
        myHashMap.put(1, 1);
        myHashMap.put(2, 2);
        Assertions.assertEquals(1, myHashMap.get(1));
        Assertions.assertEquals(-1, myHashMap.get(3));
        myHashMap.put(2, 1);
        Assertions.assertEquals(1, myHashMap.get(2));
        myHashMap.remove(2);
        Assertions.assertEquals(-1, myHashMap.get(2));
    }

    class MyHashMap {

        private final int[] arr;

        public MyHashMap() {
            arr = new int[1000001];
            Arrays.fill(arr, -1);
        }

        public void put(int key, int value) {
            arr[key] = value;
        }

        public int get(int key) {
            return arr[key];
        }

        public void remove(int key) {
            arr[key] = -1;
        }
    }

    class MyHashMap2 {

        private final int bucketSize = 1000;
        private final ListNode[] buckets;

        public MyHashMap2() {
            buckets = new ListNode[bucketSize];
            // watch out! In Java default value for int is 0
            // we need to assign value for dummy node outside the requirement
            Arrays.fill(buckets, new ListNode(-1, -1, null));
        }

        private int getBucketId(int key) {
            return key % bucketSize;
        }

        public void put(int key, int value) {
            int bucketId = getBucketId(key);
            ListNode node = buckets[bucketId];
            // at the end of loop, node must point to last node
            // 1st node is dummy node, so we check the next node for the equal key
            while (node.next != null) {
                if (node.next.key == key) {
                    node.next.value = value;
                    return;
                }
                node = node.next;
            }
            node.next = new ListNode(key, value, null);
        }

        public int get(int key) {
            int bucketId = getBucketId(key);
            ListNode node = buckets[bucketId];
            while (node != null) {
                if (node.key == key) {
                    return node.value;
                }
                node = node.next;
            }

            return -1;
        }

        public void remove(int key) {
            int bucketId = getBucketId(key);
            ListNode node = buckets[bucketId];
            while (node.next != null) {
                if (node.next.key == key) {
                    node.next = node.next.next;
                    // if we don't want to use return() then we need to check if the node is null
                    return;
                }
                node = node.next;
            }
        }

        class ListNode {
            private int key;
            private int value;
            private ListNode next;

            public ListNode() { }

            public ListNode(int key, int value, ListNode next) {
                this.key = key;
                this.value = value;
                this.next = next;
            }

            public int getKey() {
                return key;
            }

            public void setValue(int value) {
                this.value = value;
            }

            public int getValue() {
                return value;
            }

            public ListNode getNext() {
                return next;
            }
        }
    }
}

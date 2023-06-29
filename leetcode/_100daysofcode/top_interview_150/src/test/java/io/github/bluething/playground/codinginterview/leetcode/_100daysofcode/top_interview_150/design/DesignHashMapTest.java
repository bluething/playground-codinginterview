package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

    class MyHashMap {

        public MyHashMap() {

        }

        public void put(int key, int value) {

        }

        public int get(int key) {
            return 0;
        }

        public void remove(int key) {

        }
    }
}

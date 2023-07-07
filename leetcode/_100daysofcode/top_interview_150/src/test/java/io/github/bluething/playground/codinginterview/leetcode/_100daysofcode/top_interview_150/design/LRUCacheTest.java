package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/lru-cache/?envType=study-plan-v2&envId=top-interview-150
class LRUCacheTest {

    @Test
    void case01() {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        Assertions.assertEquals(1, lRUCache.get(1));    // return 1
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        Assertions.assertEquals(2, lRUCache.get(2));    // returns -1 (not found)
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        Assertions.assertEquals(-1, lRUCache.get(1));    // return -1 (not found)
        Assertions.assertEquals(3, lRUCache.get(3));    // return 3
        Assertions.assertEquals(4, lRUCache.get(4));    // return 4
    }

    class LRUCache {

        public LRUCache(int capacity) {

        }

        public int get(int key) {
            return 0;
        }

        public void put(int key, int value) {

        }
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

// https://leetcode.com/problems/kth-largest-element-in-a-stream/description/
class KthLargestElementInAStreamTest {

    @Test
    void case01() {
        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
        Assertions.assertEquals(4, kthLargest.add(3));
        Assertions.assertEquals(5, kthLargest.add(5));
        Assertions.assertEquals(5, kthLargest.add(10));
        Assertions.assertEquals(8, kthLargest.add(9));
        Assertions.assertEquals(8, kthLargest.add(4));
    }

    // A heap:
    //  Stores elements, and can find the smallest (min-heap) or largest (max-heap) element stored in O(1)
    //  Can add elements and remove the smallest (min-heap) or largest (max-heap) element in O(log n)
    //  Can perform insertions and removals while always maintaining the first property.
    // In short, a heap is a data structure that is capable of giving you the smallest (or largest) element (by some criteria) in constant time,
    //  while also being able to add elements and remove the smallest (or largest) element in only logarithmic time.
    // Just maintain the heap size <= k
    class KthLargest {

        private final int k;
        private final PriorityQueue<Integer> minHeap;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            minHeap = new PriorityQueue<>();
            for (int num : nums) {
                minHeap.offer(num);
            }

            while (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        public int add(int val) {
            minHeap.offer(val);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
            return minHeap.peek();
        }
    }
}

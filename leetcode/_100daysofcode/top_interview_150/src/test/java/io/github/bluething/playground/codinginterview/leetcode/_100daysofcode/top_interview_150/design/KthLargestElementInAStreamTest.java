package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/kth-largest-element-in-a-stream/description/
class KthLargestElementInAStreamTest {

    @Test
    void case01() {
        KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
        Assertions.assertEquals(4, kthLargest.add(3));
        Assertions.assertEquals(5, kthLargest.add(5));
        Assertions.assertEquals(5, kthLargest.add(10));
        Assertions.assertEquals(8, kthLargest.add(9));
        Assertions.assertEquals(8, kthLargest.add(4));
    }

    class KthLargest {

        public KthLargest(int k, int[] nums) {

        }

        public int add(int val) {
            return 0;
        }
    }
}

package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TopKFrequentElementsTest {
    @Test
    void case01() {
        Assertions.assertArrayEquals(new int[]{1,2}, topKFrequent(new int[]{1,1,1,2,2,3}, 2));
    }

    @Test
    void case02() {
        Assertions.assertArrayEquals(new int[]{1}, topKFrequent(new int[]{1}, 1));
    }

    @Test
    void case03() {
        Assertions.assertArrayEquals(new int[]{1,2}, topKFrequent2(new int[]{1,1,1,2,2,3}, 2));
    }

    @Test
    void case04() {
        Assertions.assertArrayEquals(new int[]{1}, topKFrequent2(new int[]{1}, 1));
    }


    private int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int num : nums) {
            numFreq.put(num, numFreq.getOrDefault(num, 0) + 1);
        }

        // bucket sort
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int num : numFreq.keySet()) {
            int freq = numFreq.get(num);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }

            buckets[freq].add(num);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
                result.addAll(buckets[i]);
                if (result.size() == k) {
                    break;
                }
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    private int[] topKFrequent2(int[] nums, int k) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int num : nums) {
            numFreq.put(num, numFreq.getOrDefault(num, 0) + 1);
        }

        Queue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a,b) -> (b.getValue() - a.getValue()));
        maxHeap.addAll(numFreq.entrySet());

        List<Integer> result = new ArrayList<>();
        while (result.size() < k) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            result.add(entry.getKey());
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}

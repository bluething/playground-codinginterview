package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

// https://leetcode.com/problems/top-k-frequent-elements/
class TopKFrequentElementsTest {

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
        for (int i = 0; i < nums.length; i++) {
            numFreq.put(nums[i], numFreq.getOrDefault(nums[i], 0) + 1);
        }

        // using array of list integer as a bucket
        // the index naturally sort the bucket asc (start from 0 until number of nums)
        // we map from numFreq<num, freq> into bucket, freq->idx, num->list member
        List<Integer>[] buckets = new ArrayList[nums.length+1];
        for (int num : numFreq.keySet()) {
            int freq = numFreq.get(num);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        }

        // just iterate from the last bucket to get n highest freq
        List<Integer> results = new ArrayList<>();
        for (int i = buckets.length-1; i >= 0; i--) {
            if (buckets[i] != null) {
                results.addAll(buckets[i]);
                if (results.size() == k) {
                    break;
                }
            }
        }

        return results.stream().mapToInt(i -> i).toArray();
    }

    private int[] topKFrequent2(int[] nums, int k) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numFreq.put(nums[i], numFreq.getOrDefault(nums[i], 0) + 1);
        }

        Queue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a,b) -> (b.getValue()-a.getValue()));
        for (Map.Entry<Integer, Integer> entry : numFreq.entrySet()) {
            maxHeap.add(entry);
        }

        List<Integer> results = new ArrayList<>();
        while (results.size() < k) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            results.add(entry.getKey());
        }

        return results.stream().mapToInt(i -> i).toArray();
    }
}

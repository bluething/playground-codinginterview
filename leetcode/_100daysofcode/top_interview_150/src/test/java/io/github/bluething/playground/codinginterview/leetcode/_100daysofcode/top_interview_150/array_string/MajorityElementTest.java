package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/majority-element/?envType=study-plan-v2&id=top-interview-150
class MajorityElementTest {
    @Test
    void case01() {
        Assertions.assertEquals(3, majorityElement(new int[]{3,2,3}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(2, majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    @Test
    void case03() {
        Assertions.assertEquals(3, majorityElement2(new int[]{3,2,3}));
    }

    @Test
    void case04() {
        Assertions.assertEquals(2, majorityElement2(new int[]{2,2,1,1,1,2,2}));
    }

    @Test
    void case05() {
        Assertions.assertEquals(3, majorityElement3(new int[]{3,2,3}));
    }

    @Test
    void case06() {
        Assertions.assertEquals(2, majorityElement3(new int[]{2,2,1,1,1,2,2}));
    }

    // the key is "You may assume that the majority element always exists in the array"
    private int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    private int majorityElement2(int[] nums) {
        Map<Integer, Integer> freqs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            freqs.put(nums[i], freqs.getOrDefault(nums[i], 0) + 1);
            if (freqs.get(nums[i]) > nums.length/2) {
                return nums[i];
            }
        }
        return -1;
    }

    private int majorityElement3(int[] nums) {
        int counter = 0;
        int major = 0;
        for (int num : nums) {
            if (counter == 0) {
                major = num;
            }

            // increment the counter as long as current value equal to major
            // otherwise decrease it until 0, so we can assign new major candidate
            if (num == major) {
                counter++;
            } else {
                counter--;
            }
        }

        return major;
    }
}

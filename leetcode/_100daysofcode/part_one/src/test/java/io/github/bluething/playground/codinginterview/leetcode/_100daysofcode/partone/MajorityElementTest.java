package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElementTest {

    @Test
    public void case01() {
        Assertions.assertEquals(3, majorityElement(new int[]{3,2,3}));
    }

    @Test
    public void case02() {
        Assertions.assertEquals(2, majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    @Test
    public void case03() {
        Assertions.assertEquals(3, majorityElement2(new int[]{3,2,3}));
    }

    @Test
    public void case04() {
        Assertions.assertEquals(2, majorityElement2(new int[]{2,2,1,1,1,2,2}));
    }

    private int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    private int majorityElement2(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int result = -1;
        for (int num : nums) {
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);
            }
            if (freqMap.get(num) > (nums.length/2)) {
                result = num;
                break;
            }
        }
        return result;
    }
}

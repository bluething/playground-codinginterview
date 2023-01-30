package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumberTest {

    @Test
    public void case01() {
        Assertions.assertEquals(1, singleNumber(new int[]{2,2,1}));
    }

    @Test
    public void case02() {
        Assertions.assertEquals(4, singleNumber(new int[]{4,1,2,1,2}));
    }

    @Test
    public void case03() {
        Assertions.assertEquals(1, singleNumber(new int[]{1}));
    }

    @Test
    public void case04() {
        Assertions.assertEquals(1, singleNumber2(new int[]{2,2,1}));
    }

    @Test
    public void case05() {
        Assertions.assertEquals(4, singleNumber2(new int[]{4,1,2,1,2}));
    }

    @Test
    public void case06() {
        Assertions.assertEquals(1, singleNumber2(new int[]{1}));
    }

    @Test
    public void case07() {
        Assertions.assertEquals(1, singleNumber3(new int[]{2,2,1}));
    }

    @Test
    public void case08() {
        Assertions.assertEquals(4, singleNumber3(new int[]{4,1,2,1,2}));
    }

    @Test
    public void case09() {
        Assertions.assertEquals(1, singleNumber3(new int[]{1}));
    }

    private int singleNumber(int[] nums) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int num : nums) {
            if (numFreq.containsKey(num)) {
                numFreq.put(num, numFreq.get(num) + 1);
            } else {
                numFreq.put(num, 1);
            }
        }

        for (int i : numFreq.keySet()) {
            if (numFreq.get(i) == 1) {
                return i;
            }
        }

        return -1;
    }

    private int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        // check for pair
        for (int i = 0; i < nums.length-1; i += 2) {
            if (nums[i] != nums[i+1]) {
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }

    private int singleNumber3(int[] nums) {
        // any value XoR with 0 will return the value itself
        int result = 0;
        for (int num : nums) {
            // a ^ b ^ a = (a ^ a) ^ b = 0 ^ b
            result ^= num;
        }

        return result;
    }
}

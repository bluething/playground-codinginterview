package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}

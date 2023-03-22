package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://aaronice.gitbook.io/lintcode/high_frequency/two-sum-iii-data-structure-design
public class TwoSumIIIDataStructureDesignTest {

    @Test
    void case01() {
        TwoSum twoSum = new TwoSum();
        twoSum.add(1);
        twoSum.add(3);
        twoSum.add(5);
        Assertions.assertTrue(twoSum.find(4));
        Assertions.assertFalse(twoSum.find(7));
    }

    @Test
    void case02() {
        TwoSum twoSum = new TwoSum();
        twoSum.add(3);
        twoSum.add(1);
        twoSum.add(2);
        Assertions.assertTrue(twoSum.find(3));
        Assertions.assertFalse(twoSum.find(6));
    }

    @Test
    void case03() {
        TwoSum2 twoSum = new TwoSum2();
        twoSum.add(1);
        twoSum.add(3);
        twoSum.add(5);
        Assertions.assertTrue(twoSum.find(4));
        Assertions.assertFalse(twoSum.find(7));
    }

    @Test
    void case04() {
        TwoSum2 twoSum = new TwoSum2();
        twoSum.add(3);
        twoSum.add(1);
        twoSum.add(2);
        Assertions.assertTrue(twoSum.find(3));
        Assertions.assertFalse(twoSum.find(6));
    }

    static class TwoSum {

        private final HashMap<Integer, Integer> valueCounter;

        TwoSum() {
            valueCounter = new HashMap<>();
        }

        public void add(int number) {
            // need to mark if we add same number to the object
            valueCounter.put(number, valueCounter.getOrDefault(number, 0)+1);
        }
        public boolean find(int value) {
            for (Map.Entry<Integer, Integer> valueMap : valueCounter.entrySet()) {
                int pair = value - valueMap.getKey();
                if ((pair == valueMap.getKey() && valueMap.getValue() > 1)
                        || (pair != valueMap.getKey() && valueCounter.get(pair) != null)) {
                    // if the pair same with num, example value=6 and num=6
                    // we need to know if we add the num twice (mark with value > 1)
                    return true;
                }
            }

            return false;
        }
    }

    static class TwoSum2 {

        private final HashMap<Integer, Boolean> valueFlag;
        private final List<Integer> nums;
        private int low;
        private int high;

        TwoSum2() {
            valueFlag = new HashMap<>();
            nums = new ArrayList<>();
            low = Integer.MAX_VALUE;
            high = Integer.MIN_VALUE;
        }

        public void add(int number) {
            // need to mark if we add same number to the object
            if (valueFlag.get(number) != null) {
                valueFlag.put(number, true);
            } else {
                valueFlag.put(number, false);
                nums.add(number);
                low = Math.min(low, number);
                high = Math.max(high, number);
            }
        }

        public boolean find(int value) {
            if (value < 2 * low
                    || value > 2 * high) {
                return false;
            }
            for (int num : nums) {
                int pair = value - num;
                if (valueFlag.get(pair) != null) {
                    if (pair != num) {
                        return true;
                    } else if (valueFlag.get(pair)) {
                        // if the pair same with num, example value=6 and num=6
                        // we need to know if we add the num twice (mark with true)
                        return true;
                    }
                }
            }

            return false;
        }
    }
}

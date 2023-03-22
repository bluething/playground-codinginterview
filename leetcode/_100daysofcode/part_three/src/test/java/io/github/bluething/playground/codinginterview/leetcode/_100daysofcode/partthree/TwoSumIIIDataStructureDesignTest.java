package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
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

    class TwoSum {

        private final HashMap<Integer, Integer> valueCounter;

        TwoSum() {
            valueCounter = new HashMap<>();
        }

        public void add(int number) {
            valueCounter.put(number, valueCounter.getOrDefault(number, 0)+1);
        }
        public boolean find(int value) {
            for (Map.Entry<Integer, Integer> valueMap : valueCounter.entrySet()) {
                int pair = value - valueMap.getKey();
                if ((pair == valueMap.getKey() && valueMap.getValue() > 1)
                        || (pair != valueMap.getKey() && valueCounter.get(pair) != null)) {
                    return true;
                }
            }

            return false;
        }
    }
}

package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://aaronice.gitbook.io/lintcode/high_frequency/two-sum-iii-data-structure-design
public class TwoSumIIIDataStructureDesignTest {

    @Test
    void case01() {
        TwoSum twoSum = new TwoSum();
        twoSum.add(1);
        twoSum.add(2);
        twoSum.add(5);
        Assertions.assertTrue(twoSum.find(4));
        Assertions.assertFalse(twoSum.find(6));
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
        public void add(int number) {

        }
        public boolean find(int value) {
            return true;
        }
    }
}

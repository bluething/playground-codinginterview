package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weekone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://www.hackerrank.com/challenges/three-month-preparation-kit-divisible-sum-pairs/problem
public class DivisibleSumPairsTest {

    @Test
    void case01() {
        Assertions.assertEquals(5, divisibleSumPairs(6, 3, Arrays.asList(1, 3, 2, 6, 1, 2)));
    }

    @Test
    void case02() {
        Assertions.assertEquals(3, divisibleSumPairs(6, 5, Arrays.asList(1, 2, 3, 4, 5, 6)));
    }

    @Test
    void case03() {
        Assertions.assertEquals(5, divisibleSumPairs2(6, 3, Arrays.asList(1, 3, 2, 6, 1, 2)));
    }

    @Test
    void case04() {
        Assertions.assertEquals(3, divisibleSumPairs2(6, 5, Arrays.asList(1, 2, 3, 4, 5, 6)));
    }

    private int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int numOfPair = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    numOfPair++;
                }
            }
        }
        return numOfPair;
    }

    // the idea is use a Map to save a mod-counter values
    // for current element, we see the map as a mod counter, increment the value if the element mod result are same
    // for other element, we see the map as a holder for a compliment mod
    private int divisibleSumPairs2(int n, int k, List<Integer> ar) {
        int numOfPair = 0;
        Map<Integer, Integer> modCount = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int mod = ar.get(i) % k;
            int compliment = mod == 0? 0 : k - mod;
            if (modCount.containsKey(compliment)) {
                numOfPair += modCount.get(compliment);
            }

            if (modCount.containsKey(mod)) {
                modCount.put(mod, modCount.get(mod)+1);
            } else {
                modCount.put(mod, 1);
            }
        }

        return numOfPair;
    }
}

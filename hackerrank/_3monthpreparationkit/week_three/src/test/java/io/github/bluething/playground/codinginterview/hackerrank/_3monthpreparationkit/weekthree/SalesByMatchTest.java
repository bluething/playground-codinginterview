package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weekthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://www.hackerrank.com/challenges/three-month-preparation-kit-sock-merchant/problem
public class SalesByMatchTest {
    @Test
    public void case01() {
        Assertions.assertEquals(3, sockMerchant(9, Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20)));
    }

    @Test
    public void case02() {
        Assertions.assertEquals(2, sockMerchant(7, Arrays.asList(1, 2, 1, 2, 1, 3, 2)));
    }

    private int sockMerchant(int n, List<Integer> ar) {
        int numOfPair = 0;
        Set<Integer> socks = new HashSet<>();
        for (Integer val : ar) {
            if (!socks.add(val)) {
                numOfPair++;
                socks.remove(val);
            }
        }

        return numOfPair;
    }
}

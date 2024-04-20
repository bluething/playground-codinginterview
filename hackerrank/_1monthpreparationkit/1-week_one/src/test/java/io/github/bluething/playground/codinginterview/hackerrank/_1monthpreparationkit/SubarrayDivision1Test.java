package io.github.bluething.playground.codinginterview.hackerrank._1monthpreparationkit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SubarrayDivision1Test {
    @Test
    void case01() {
        Assertions.assertEquals(2, birthday(List.of(2, 2, 1, 3, 2), 4, 2));
    }

    private int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int left = 0;
        int right = left + m - 1;
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += s.get(i);
        }
        if (sum == d) {
            count++;
        }

        while (++right < s.size()) {
            sum += s.get(right);
            sum -= s.get(left++);
            if (sum == d) {
                count++;
            }
        }

        return count;
    }
}

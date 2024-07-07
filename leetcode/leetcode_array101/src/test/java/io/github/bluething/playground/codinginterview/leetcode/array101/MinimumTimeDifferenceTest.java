package io.github.bluething.playground.codinginterview.leetcode.array101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class MinimumTimeDifferenceTest {
    @Test
    void case01() {
        Assertions.assertEquals(1, findMinDifference(List.of("23:59","00:00")));
    }
    @Test
    void case02() {
        Assertions.assertEquals(0, findMinDifference(List.of("00:00","23:59","00:00")));
    }
    @Test
    void case03() {
        Assertions.assertEquals(1, findMinDifference2(List.of("23:59","00:00")));
    }
    @Test
    void case04() {
        Assertions.assertEquals(0, findMinDifference2(List.of("00:00","23:59","00:00")));
    }

    private int findMinDifference(List<String> timePoints) {
        Set<Integer> timeInMinutes = new HashSet<>();
        int currentMinute = 0;
        int maxMinute = Integer.MIN_VALUE;
        for (String timePoint : timePoints) {
            currentMinute = hourToMinute(timePoint);
            maxMinute = Math.max(maxMinute, currentMinute);
            if (!timeInMinutes.add(currentMinute)) {
                return 0;
            }
        }

        Integer prevMinute = null, minDiff = Integer.MAX_VALUE;
        for (currentMinute = maxMinute; currentMinute >= 0; currentMinute--) {
            if (timeInMinutes.contains(currentMinute)) {
                if (prevMinute != null) {
                    // minimum between clockwise and counter clockwise
                    // to handle 00:00 case
                    minDiff = Math.min(minDiff, prevMinute - currentMinute);
                    minDiff = Math.min(minDiff, (currentMinute + 24*60) - prevMinute);
                }

                prevMinute = currentMinute;
            }
        }

        minDiff = Math.min(minDiff, maxMinute - prevMinute);
        minDiff = Math.min(minDiff, (prevMinute + 24*60) - maxMinute);

        return minDiff;
    }
    private int hourToMinute(String time) {
        String[] times = time.split(":");
        return Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
    }

    private int findMinDifference2(List<String> timePoints) {
        // automatically sorted asc
        // check diff between 2 consecutive minute
        boolean[] minutesOn = new boolean[24 * 60];
        int currentMinute = 0;
        for (String timePoint : timePoints) {
            currentMinute = hourToMinute(timePoint);
            if (minutesOn[currentMinute]) {
                return 0;
            }
            minutesOn[hourToMinute(timePoint)] = true;
        }

        int prevMinute = 0;
        int minDiff = Integer.MAX_VALUE;
        int lastMinute = 0;
        int firstMinute = 0;
        int idx = minutesOn.length - 1;
        while (!minutesOn[idx]) {
            idx--;
        }
        lastMinute = idx;

        idx = 0;
        while (!minutesOn[idx]) {
            idx++;
        }
        firstMinute = idx;

        prevMinute = firstMinute;
        for (int i = firstMinute + 1; i <= lastMinute; i++) {
            if (minutesOn[i]) {
                minDiff = Math.min(minDiff, i - prevMinute);
                prevMinute = i;
            }
        }

        // counterclockwise check
        minDiff = Math.min(minDiff, (24*60 - lastMinute + firstMinute));

        return minDiff;
    }
}

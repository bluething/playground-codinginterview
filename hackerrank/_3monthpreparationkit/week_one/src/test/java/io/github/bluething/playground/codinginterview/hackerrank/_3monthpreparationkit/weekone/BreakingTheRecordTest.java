package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weekone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/three-month-preparation-kit-breaking-best-and-worst-records/problem
public class BreakingTheRecordTest {

    @Test
    void case01() {
        Assertions.assertEquals(Arrays.asList(1, 1), breakingRecords(Arrays.asList(12, 24, 10, 24)));
    }

    private List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> records = new ArrayList<>();
        int min = scores.get(0);
        int max = scores.get(0);
        int minCount = 0;
        int maxCount = 0;
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) >  max) {
                max = scores.get(i);
                maxCount++;
                continue;
            }
            if (scores.get(i) < min) {
                min = scores.get(i);
                minCount++;
            }
        }

        records.add(maxCount);
        records.add(minCount);
        return records;
    }
}

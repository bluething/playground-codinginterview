package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/subsets/description/
class SubsetsTest {

    @Test
    void case01() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(),
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(1,2),
                Arrays.asList(3),
                Arrays.asList(1,3),
                Arrays.asList(2,3),
                Arrays.asList(1,2,3)), subsets(new int[]{1,2,3}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(Arrays.asList(Arrays.asList(),
                Arrays.asList(0)), subsets(new int[]{0}));
    }

    // using intuition, cascading
    // start from subset in output list
    // At each step one takes new integer into consideration and generates new subsets from the existing ones
    private List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outputs = new ArrayList<>();
        // []
        outputs.add(new ArrayList<>());

        // num = 1
        // [] [1]
        // num = 2
        // [] [1] [2] [1][2]
        for (int num : nums) {
            List<List<Integer>> temp = new ArrayList<>();
            for (List<Integer> current : outputs) {
                // when current empty then is like create new list with num value
                // otherwise it will add the num to the existing list
                temp.add(new ArrayList<>(current){{add(num);}});
            }
            for (List<Integer> current : temp) {
                outputs.add(current);
            }
        }

        return outputs;
    }
}

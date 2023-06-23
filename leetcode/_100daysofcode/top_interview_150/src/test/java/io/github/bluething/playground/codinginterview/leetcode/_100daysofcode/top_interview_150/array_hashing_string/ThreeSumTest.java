package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/3sum/?envType=study-plan-v2&envId=top-interview-150
class ThreeSumTest {

    @Test
    void case01() {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1,-1,2),
                Arrays.asList(-1,0,1));
        Assertions.assertEquals(expected, threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

    @Test
    void case02() {
        List<List<Integer>> expected = Collections.emptyList();
        Assertions.assertEquals(expected, threeSum(new int[]{0,1,1}));
    }

    @Test
    void case03() {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0,0,0));
        Assertions.assertEquals(expected, threeSum(new int[]{0,0,0}));
    }

    // watch out "Notice that the solution set must not contain duplicate triplets"
    // so, the expected solution shouldn't have same value for i, j, and k
    // then we need to check for each iteration if we meet the same value
    // to make our life easier, the 1st thing we need to do is sort the array
    // so, we just compare the value with previous element
    private List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
            // check duplicate for i index
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    // check duplicate for j index
                    while (j < k && nums[j] == nums[j-1]) {
                        j++;
                    }
                    // check duplicate for k index
                    while (j < k && nums[k] == nums[k+1]) {
                        k--;
                    }

                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return triplets;
    }
}

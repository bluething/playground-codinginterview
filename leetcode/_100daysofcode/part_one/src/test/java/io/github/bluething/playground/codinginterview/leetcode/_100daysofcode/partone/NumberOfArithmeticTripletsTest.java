package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class NumberOfArithmeticTripletsTest {

    @Test
    public void case01() {
        Assertions.assertEquals(2, arithmeticTriplets(new int[]{0,1,4,6,7,10}, 3));
    }

    @Test
    public void case02() {
        Assertions.assertEquals(2, arithmeticTriplets(new int[]{4,5,6,7,8,9}, 2));
    }

    @Test
    public void case03() {
        Assertions.assertEquals(2, arithmeticTriplets2(new int[]{0,1,4,6,7,10}, 3));
    }

    @Test
    public void case04() {
        Assertions.assertEquals(2, arithmeticTriplets2(new int[]{4,5,6,7,8,9}, 2));
    }

    @Test
    public void case05() {
        Assertions.assertEquals(2, arithmeticTriplets3(new int[]{0,1,4,6,7,10}, 3));
    }

    @Test
    public void case06() {
        Assertions.assertEquals(2, arithmeticTriplets3(new int[]{4,5,6,7,8,9}, 2));
    }

    private int arithmeticTriplets(int[] nums, int diff) {
        int result = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i+1; j < nums.length - 1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if ((nums[k] - nums[j] == diff) &&
                            (nums[j] - nums[i] == diff)) {
                        result++;
                    }
                }
            }
        }

        return result;
    }

    private int arithmeticTriplets2(int[] nums, int diff) {
        int result = 0;
        int j,k;
        for (int i = 0; i < nums.length - 2; i++) {
            j = i+1;
            k = j+1;
            while (k < nums.length) {
                if ((nums[k] - nums[j] == diff) &&
                        (nums[j] - nums[i] == diff)) {
                    result++;
                    k++;
                    j++;
                } else if (nums[k] - nums[j] < diff) {
                    k++;
                } else {
                    j++;
                }
            }
        }

        return result;
    }

    // from the problem description, 7 - 4 == 3 and 4 - 1 == 3
    // what we want to do is find in the collection that satisfy this condition
    // 1. Have value 7-3 = 4
    // 2. Have value 7-(2*3) = 1
    private int arithmeticTriplets3(int[] nums, int diff) {
        int result = 0;
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if ((visited.contains(nums[i] - diff)) &&
                    (visited.contains(nums[i] - diff * 2))) {
                result++;
            }
            visited.add(nums[i]);
        }

        return result;
    }
}

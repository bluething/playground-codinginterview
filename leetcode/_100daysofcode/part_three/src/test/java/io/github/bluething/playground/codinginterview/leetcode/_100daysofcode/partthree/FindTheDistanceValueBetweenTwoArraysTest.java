package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partthree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

// https://leetcode.com/problems/find-the-distance-value-between-two-arrays/description/
// https://leetcode.com/problems/find-the-distance-value-between-two-arrays/solutions/1913945/problem-description-explained-in-simple-english/
class FindTheDistanceValueBetweenTwoArraysTest {

    @Test
    void case01() {
        Assertions.assertEquals(2, findTheDistanceValue(new int[]{4,5,8}, new int[]{10,9,1,8}, 2));
    }

    @Test
    void case02() {
        Assertions.assertEquals(2, findTheDistanceValue(new int[]{1,4,2,3}, new int[]{-4,-3,6,10,20,30}, 3));
    }

    @Test
    void case03() {
        Assertions.assertEquals(1, findTheDistanceValue(new int[]{2,1,100,3}, new int[]{-5,-2,10,-3,7}, 6));
    }

    // The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d
    // |arr1[i] - arr2[j]| <= d can be rewrite to
    // arr1[i] - d <= arr2[j] <= arr1[i] + d
    // just find in arr2 the value that in range arr1[i] - d and arr1[i] + d
    private int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int numOfElementSatisfyTheCondition = 0;
        for (int arr : arr1) {
            if (isInRange(arr2, arr - d, arr + d)) {
                numOfElementSatisfyTheCondition++;
            }
        }

        return numOfElementSatisfyTheCondition;
    }

    private boolean isInRange(int[] arr, int from, int to) {
        int left = 0;
        int right = arr.length-1;
        int mid;

        while (left <= right) {
            mid = (right + left) / 2;
            if (arr[mid] >= from && arr[mid] <= to) {
                return false;
            } else if (arr[mid] < from) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return true;
    }
}

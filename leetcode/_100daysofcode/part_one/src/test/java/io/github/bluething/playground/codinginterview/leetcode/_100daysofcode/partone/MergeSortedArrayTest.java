package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {

    @Test
    public void case01() {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int[] expectedArray = new int[]{1,2,2,3,5,6};
        merge(nums1, 3, nums2, 3);
        Assertions.assertArrayEquals(expectedArray, nums1);
    }

    @Test
    public void case02() {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};
        int[] expectedArray = new int[]{1};
        merge(nums1, 1, nums2, 0);
        Assertions.assertArrayEquals(expectedArray, nums1);
    }

    @Test
    public void case03() {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        int[] expectedArray = new int[]{1};
        merge(nums1, 0, nums2, 1);
        Assertions.assertArrayEquals(expectedArray, nums1);
    }

    @Test
    public void case04() {
        int[] nums1 = new int[]{4,5,6,0,0,0};
        int[] nums2 = new int[]{1,2,3};
        int[] expectedArray = new int[]{1,2,3,4,5,6};
        merge(nums1, 3, nums2, 3);
        Assertions.assertArrayEquals(expectedArray, nums1);
    }

    private void merge(int[] nums1, int m, int[] nums2, int n) {
        // zero base index
        int idx = m + n - 1;
        m--;
        n--;
        while (m>=0 && n>=0) {
            if (nums1[m] >= nums2[n]) {
                nums1[idx--] = nums1[m--];
            } else {
                nums1[idx--] = nums2[n--];
            }
        }

        // if there are remaining nums2
        // the case is when nums1 have values greater than nums2 for all element
        // or nums1 doesn't fill with value (m==0)
        while (n >= 0) {
            nums1[idx--] = nums2[n--];
        }
    }
}

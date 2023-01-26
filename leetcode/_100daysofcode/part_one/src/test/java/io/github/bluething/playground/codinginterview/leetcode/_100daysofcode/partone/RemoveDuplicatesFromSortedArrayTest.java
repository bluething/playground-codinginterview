package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.partone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// problem https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void case01() {
        Assertions.assertEquals(2, removeDuplicates(new int[]{1,1,2}));
    }

    @Test
    public void case02() {
        Assertions.assertEquals(5, removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    @Test
    public void case03() {
        Assertions.assertEquals(2, removeDuplicates2(new int[]{1,1,2}));
    }

    @Test
    public void case04() {
        Assertions.assertEquals(5, removeDuplicates2(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }


    private int removeDuplicates(int[] nums) {
        int numOfUniqueElements = 1;
        int j = 1;
        for (int i = 0; i < nums.length-1; i++) {
            while (j < nums.length) {
                if (nums[i] != nums[j]) {
                    nums[i+1] = nums[j];
                    numOfUniqueElements++;
                    break;
                }
                j++;
            }
        }

        return numOfUniqueElements;
    }

    private int removeDuplicates2(int[] nums) {
        // use two pointers, one pointing to unique element, the another one pointing to current element
        int uniquePointer = 0;
        for (int i = 1; i < nums.length; i++) {
            // if we find unmatched element (means we find the next unique element
            // increment the index that use as a pointer to unique element
            // replace element that pointed by uniquePointer by value that pointed by i
            if (nums[i] != nums[i-1]) {
                uniquePointer++;
                nums[uniquePointer] = nums[i];
            }
        }

        // because we start the pointer from 0 (1st element)
        // but actually the 1st element is the 1st unique element, so we need to add by 1 for correct answer
        return uniquePointer+1;
    }
}

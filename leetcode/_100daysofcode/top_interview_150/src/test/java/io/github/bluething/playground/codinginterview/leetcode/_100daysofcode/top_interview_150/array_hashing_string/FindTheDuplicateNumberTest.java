package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/find-the-duplicate-number/
class FindTheDuplicateNumberTest {

    @Test
    void case01() {
        Assertions.assertEquals(2, findDuplicate(new int[]{1,3,4,2,2}));
    }

    @Test
    void case02() {
        Assertions.assertEquals(3, findDuplicate(new int[]{3,1,3,4,2}));
    }

    @Test
    void case03() {
        Assertions.assertEquals(2, findDuplicate2(new int[]{1,3,4,2,2}));
    }

    @Test
    void case04() {
        Assertions.assertEquals(3, findDuplicate2(new int[]{3,1,3,4,2}));
    }

    // the key is from the question we know that 1 <= nums[i] <= n
    //  means the value can be used as a pointer to array element (nums[i]-1)
    // when 1st time we visit the element, change the value to negative
    //  just check if the value point by a visited index is negative, which means we already visited the element
    private int findDuplicate(int[] nums) {
        int firstDuplicateIdx = -1;
        int visitedIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            visitedIdx = Math.abs(nums[i]) - 1;
            if (nums[visitedIdx] < 0) {
                firstDuplicateIdx = Math.abs(nums[i]);
                break;
            } else {
                nums[visitedIdx] *= -1;
            }
        }
        return firstDuplicateIdx;
    }

    // the fact from problem
    //  nums.length == n + 1
    //  1 <= nums[i] <= n
    // we can use Floyd's algorithm
    // nums[0] can be used as a start line
    //  because we will have max value = n + 1 then no element will be point to idx 0
    // the tricky part is when we find the cycle
    //  we need to find the duplicate value right
    //  the duplicate value is the value that start the cycle
    //      we can find it by reset the slow (or fast) then move both at same speed (by 1)
    //      then they will find each other in the duplicate value
    private int findDuplicate2(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return fast;
    }
}

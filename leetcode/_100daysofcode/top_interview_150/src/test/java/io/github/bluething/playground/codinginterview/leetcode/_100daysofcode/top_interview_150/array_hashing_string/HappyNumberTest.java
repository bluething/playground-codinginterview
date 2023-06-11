package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.array_hashing_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/happy-number/description/?envType=study-plan-v2&id=top-interview-150
class HappyNumberTest {

    @Test
    void case01() {
        Assertions.assertTrue(isHappy(19));
    }

    @Test
    void case02() {
        Assertions.assertFalse(isHappy(2));
    }

    @Test
    void case03() {
        Assertions.assertFalse(isHappy(116));
    }

    @Test
    void case04() {
        Assertions.assertTrue(isHappy2(19));
    }

    @Test
    void case05() {
        Assertions.assertFalse(isHappy2(2));
    }

    @Test
    void case06() {
        Assertions.assertFalse(isHappy2(116));
    }

    // to detect a cycle we use a Set
    // as long as we can add the next n it's mean we can continue to generate the next n
    private boolean isHappy(int n) {
        Set<Integer> uniqueN = new HashSet<>();
        while (n != 1 && uniqueN.add(n)) {
           n = getNext(n);
        }

        return n == 1;
    }

    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            n /= 10;
            sum += d * d;
        }

        return sum;
    }

    // whenever we hear the word cycle the first thing we should remember is "Floyd's cycle-finding algorithm"
    // also known as "Tortoise and the Hare algorithm"
    private boolean isHappy2(int n) {
        int slow = n;
        int fast = getNext(n);
        while (fast != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }

        return fast == 1;
    }
}

package io.github.bluething.playground.codinginterview.leetcode.stackqueue101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

class CarFleetTest {
    @Test
    void case01() {
        Assertions.assertEquals(3, carFleet(12, new int[]{10,8,0,5,3}, new int[]{2,4,1,1,3}));
    }
    @Test
    void case02() {
        Assertions.assertEquals(1, carFleet(10, new int[]{3}, new int[]{3}));
    }
    @Test
    void case03() {
        Assertions.assertEquals(1, carFleet(100, new int[]{0,2,4}, new int[]{4,2,1}));
    }

    private int carFleet(int target, int[] position, int[] speed) {
        double[][] cars = new double[position.length][2];
        for (int i = 0; i < position.length; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        // sort asc by position
        Arrays.sort(cars, Comparator.comparingDouble(a -> a[0]));
        Stack<Double> stack = new Stack<>();
        // from the closest car to the target
        for (int i = position.length-1; i >= 0; i--) {
            // calculate the time needed to reach the target
            double timeSpent = (target - cars[i][0]) / cars[i][1];
            // if the stack is not empty and current car will reach the target
            // earlier or at same time as the other cars (top of the stack)
            // then the current car join the fleet
            // the stack will have asc order, from bottom
            // because we calculate time spent from closest car
            if (!stack.isEmpty() && timeSpent <= stack.peek()) {
                continue;
            }

            // current car doesn't join the existing fleet, will arrive latter
            stack.push(timeSpent);
        }

        return stack.size();
    }
}

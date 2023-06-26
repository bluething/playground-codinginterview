package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/design-parking-system/
class DesignParkingSystemTest {

    @Test
    void case01() {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        Assertions.assertTrue(parkingSystem.addCar(1));
        Assertions.assertTrue(parkingSystem.addCar(2));
        Assertions.assertFalse(parkingSystem.addCar(3));
        Assertions.assertFalse(parkingSystem.addCar(1));
    }

    @Test
    void case02() {
        ParkingSystem2 parkingSystem = new ParkingSystem2(1, 1, 0);
        Assertions.assertTrue(parkingSystem.addCar(1));
        Assertions.assertTrue(parkingSystem.addCar(2));
        Assertions.assertFalse(parkingSystem.addCar(3));
        Assertions.assertFalse(parkingSystem.addCar(1));
    }


    class ParkingSystem {

        private final int[] spaces = new int[3];
        private final int[] counters = new int[3];

        public ParkingSystem(int big, int medium, int small) {
            spaces[0] = big;
            spaces[1] = medium;
            spaces[2] = small;
        }

        public boolean addCar(int carType) {
            if (counters[carType-1] < spaces[carType-1]) {
                counters[carType-1]++;
                return true;
            }

            return false;
        }
    }

    class ParkingSystem2 {

        private final int[] spaces = new int[3];

        public ParkingSystem2(int big, int medium, int small) {
            spaces[0] = big;
            spaces[1] = medium;
            spaces[2] = small;
        }

        public boolean addCar(int carType) {
            if (spaces[carType-1] > 0 ) {
                spaces[carType-1]--;
                return true;
            }

            return false;
        }
    }
}

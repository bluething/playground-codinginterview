package io.github.bluething.playground.codinginterview.leetcode.string101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DesignUndergroundSystemTest {
    @Test
    void case01() {
        UndergroundSystem undergroundSystem = new UndergroundSystem();
        undergroundSystem.checkIn(45,"Leyton",3);
        undergroundSystem.checkIn(32,"Paradise",8);
        undergroundSystem.checkIn(27,"Leyton",10);
        undergroundSystem.checkOut(45,"Waterloo",15);
        undergroundSystem.checkOut(27,"Waterloo",20);
        undergroundSystem.checkOut(32,"Cambridge",22);
        Assertions.assertEquals(14.0d, undergroundSystem.getAverageTime("Paradise","Cambridge"));
        Assertions.assertEquals(11.0d, undergroundSystem.getAverageTime("Leyton","Waterloo"));
        undergroundSystem.checkIn(10,"Leyton",24);
        Assertions.assertEquals(11.0d, undergroundSystem.getAverageTime("Leyton","Waterloo"));
        undergroundSystem.checkOut(10,"Waterloo",38);
        Assertions.assertEquals(12.0d, undergroundSystem.getAverageTime("Leyton","Waterloo"));
    }
    @Test
    void case02() {
        UndergroundSystem undergroundSystem = new UndergroundSystem();
        undergroundSystem.checkIn(10, "Leyton", 3);
        undergroundSystem.checkOut(10, "Paradise", 8); // Customer 10 "Leyton" -> "Paradise" in 8-3 = 5
        Assertions.assertEquals(5.0d, undergroundSystem.getAverageTime("Leyton", "Paradise")); // return 5.00000, (5) / 1 = 5
        undergroundSystem.checkIn(5, "Leyton", 10);
        undergroundSystem.checkOut(5, "Paradise", 16); // Customer 5 "Leyton" -> "Paradise" in 16-10 = 6
        Assertions.assertEquals(5.50d, undergroundSystem.getAverageTime("Leyton", "Paradise")); // return 5.50000, (5 + 6) / 2 = 5.5
        undergroundSystem.checkIn(2, "Leyton", 21);
        undergroundSystem.checkOut(2, "Paradise", 30); // Customer 2 "Leyton" -> "Paradise" in 30-21 = 9
        Assertions.assertEquals(6.66667d, undergroundSystem.getAverageTime("Leyton", "Paradise")); // return 6.66667, (5 + 6 + 9) / 3 = 6.66667
    }

    class UndergroundSystem {

        public UndergroundSystem() {

        }

        public void checkIn(int id, String stationName, int t) {

        }

        public void checkOut(int id, String stationName, int t) {

        }

        public double getAverageTime(String startStation, String endStation) {
            return 0.0d;
        }
    }
}

package io.github.bluething.playground.codinginterview.hackerrank._1weekpreparationkit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TowerBreakersTest {
    @Test
    void case01() {
        Assertions.assertEquals(2, towerBreakers(2, 2));
    }
    @Test
    void case02() {
        Assertions.assertEquals(1, towerBreakers(1, 4));
    }

    private  int towerBreakers(int n, int m) {
        // if there's one tower left, player 2 doesn't have any move
        if (n == 1) {
            return 1;
        }
        // player 1 doesn't have any move because the tower left is 1
        if (n % 2 == 0) {
            return 2;
        }
        if (m == 1) {
            return 2;
        }
        return 1;
    }
}

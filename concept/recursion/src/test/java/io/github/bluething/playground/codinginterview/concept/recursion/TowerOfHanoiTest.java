package io.github.bluething.playground.codinginterview.concept.recursion;

import org.junit.jupiter.api.Test;

// https://www.hackerearth.com/blog/developers/tower-hanoi-recursion-game-algorithm-explained/
// https://www.geeksforgeeks.org/c-program-for-tower-of-hanoi/
class TowerOfHanoiTest {

    @Test
    void case01() {
        doMove(3, 'a', 'c', 'b');
    }

    @Test
    void case02() {
        doMove(6, 'a', 'c', 'b');
    }

    private void doMove(int n, char from, char to, char helper) {
        if (n == 0) {
            return;
        }

        doMove(n-1, from, helper, to);
        System.out.printf("Move disk %d from %c to %c\n", n, from, to);
        doMove(n-1, helper, to, from);
    }
}

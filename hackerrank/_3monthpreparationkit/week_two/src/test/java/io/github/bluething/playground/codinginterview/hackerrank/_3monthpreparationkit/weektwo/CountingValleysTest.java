package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weektwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// https://www.hackerrank.com/challenges/three-month-preparation-kit-counting-valleys/problem
public class CountingValleysTest {
    @Test
    public void case01() {
        Assertions.assertEquals(1, countingValleys(8, "UDDDUDUU"));
    }

    private int countingValleys(int steps, String path) {
        boolean isInValley = false;
        int numOfValley = 0;
        int seaLevel = 0;
        for (Character pathChar : path.toCharArray()) {
            if (pathChar == 'U') {
                seaLevel++;
            } else {
                seaLevel--;
            }

            if (isInValley && seaLevel == 0) {
                numOfValley++;
            }

            if (seaLevel < 0) {
                isInValley = true;
            } else {
                isInValley = false;
            }
        }
        return numOfValley;
    }
}

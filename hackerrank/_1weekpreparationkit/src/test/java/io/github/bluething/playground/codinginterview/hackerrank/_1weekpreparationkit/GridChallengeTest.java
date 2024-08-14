package io.github.bluething.playground.codinginterview.hackerrank._1weekpreparationkit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class GridChallengeTest {
    @Test
    void case01() {
        Assertions.assertEquals("YES", gridChallenge(List.of("ebacd", "fghij", "olmkn", "trpqs", "xywuv")));
    }
    private String gridChallenge(List<String> grid) {
        char[] firstGrid = grid.get(0).toCharArray();
        Arrays.sort(firstGrid);
        char[] secondGrid;
        for (int i = 1; i < grid.size(); i++) {
            secondGrid = grid.get(i).toCharArray();
            Arrays.sort(secondGrid);
            for (int j = 0; j < secondGrid.length; j++) {
                if (firstGrid[j] > secondGrid[j]) {
                    return "NO";
                }
            }
            firstGrid = secondGrid;
        }
        return "YES";
    }
}

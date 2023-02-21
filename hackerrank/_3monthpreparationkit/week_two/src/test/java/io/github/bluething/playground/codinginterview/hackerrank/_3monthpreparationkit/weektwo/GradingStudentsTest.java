package io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.weektwo;

import io.github.bluething.playground.codinginterview.hackerrank._3monthpreparationkit.ParentTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudentsTest extends ParentTest {
    @Test
    public void case01() {
        Assertions.assertEquals(Arrays.asList(85, 29, 57), gradingStudents(Arrays.asList(84, 29, 57)));
    }

    @Test
    public void case02() {
        Assertions.assertEquals(Arrays.asList(75, 67, 40, 33), gradingStudents(Arrays.asList(73, 67, 38, 33)));
    }

    private List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();
        int roundedGrade;
        int roundedCandidate;
        for (Integer grade : grades) {
            roundedCandidate = (grade - grade % 5) + 5;
            if (roundedCandidate < 40) {
                roundedGrade = grade;
            } else {
                if (roundedCandidate - grade < 3) {
                    roundedGrade = roundedCandidate;
                } else {
                    roundedGrade = grade;
                }
            }

            roundedGrades.add(roundedGrade);
        }

        return roundedGrades;
    }
}

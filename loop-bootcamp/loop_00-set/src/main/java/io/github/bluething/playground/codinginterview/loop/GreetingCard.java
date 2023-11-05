package io.github.bluething.playground.codinginterview.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class GreetingCard {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numOfPoint = Integer.parseInt(bufferedReader.readLine());
        Coordinate[] points = new Coordinate[numOfPoint];
        String[] inputParts = new String[2];
        for (int i = 0; i < numOfPoint; i++) {
            inputParts = bufferedReader.readLine().split(" ");
            points[i] = new Coordinate(Integer.parseInt(inputParts[0]), Integer.parseInt(inputParts[1]));
        }
        List<Coordinate> pythagoreanCoordinates = generatePythagoreanCoordinate();
        Set<Coordinate> visitedPoints = new HashSet<>();
        int numOfPair = 0;
        for (Coordinate coordinate : points) {
            for (Coordinate pythagoreanCoordinate : pythagoreanCoordinates) {
                if (visitedPoints.contains(new Coordinate(coordinate.x + pythagoreanCoordinate.x, coordinate.y + pythagoreanCoordinate.y))) {
                    numOfPair++;
                }
            }
            visitedPoints.add(coordinate);
        }

        System.out.print(numOfPair--);
    }

    private static List<Coordinate> generatePythagoreanCoordinate() {
        List<Coordinate> pythagoreanCoordinates = new ArrayList<>();
        pythagoreanCoordinates.add(new Coordinate(2018, 0));
        pythagoreanCoordinates.add(new Coordinate(-2018, 0));
        pythagoreanCoordinates.add(new Coordinate(0, 2018));
        pythagoreanCoordinates.add(new Coordinate(0, -2018));
        pythagoreanCoordinates.add(new Coordinate(1680, 1118));
        pythagoreanCoordinates.add(new Coordinate(1680, -1118));
        pythagoreanCoordinates.add(new Coordinate(-1680, 1118));
        pythagoreanCoordinates.add(new Coordinate(-1680, -1118));
        pythagoreanCoordinates.add(new Coordinate(1118, 1680));
        pythagoreanCoordinates.add(new Coordinate(1118, -1680));
        pythagoreanCoordinates.add(new Coordinate(-1118, 1680));
        pythagoreanCoordinates.add(new Coordinate(-1118, -1680));
        return pythagoreanCoordinates;
    }
}

class Coordinate {
    long x;
    long y;
    public Coordinate(long x, long y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
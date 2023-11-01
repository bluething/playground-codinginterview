package io.github.bluething.playground.codinginterview.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
    }
}

class Coordinate {
    int x;
    int y;
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

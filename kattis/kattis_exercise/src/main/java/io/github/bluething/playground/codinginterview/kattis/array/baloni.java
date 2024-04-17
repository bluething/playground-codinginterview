package io.github.bluething.playground.codinginterview.kattis.array;

import io.github.bluething.playground.codinginterview.kattis.Kattio;

public class baloni {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int numOfBallon = io.getInt();
        int[] trackers = new int[numOfBallon+1];
        for (int i = 0; i < numOfBallon; i++) {
            trackers[i] = 0;
        }

        int numOfArrow = 0;
        for (int i = 0; i < numOfBallon; i++) {
            int temp = io.getInt();
            if (trackers[temp] == 0) {
                trackers[temp-1]++;
            } else {
                trackers[temp-1]++;
                trackers[temp]--;
            }
        }

        for (int tracker : trackers) {
            numOfArrow += tracker;
        }

        io.println(numOfArrow);
        io.close();
    }
}

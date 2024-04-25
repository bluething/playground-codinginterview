package io.github.bluething.playground.codinginterview.kattis.array;

import io.github.bluething.playground.codinginterview.kattis.Kattio;

public class astro {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        String[] firstStarHour = io.getWord().split(":");
        int firstStar = Integer.parseInt(firstStarHour[0]) * 60 + Integer.parseInt(firstStarHour[1]);
        String[] secondStarHour = io.getWord().split(":");
        int secondStar = Integer.parseInt(secondStarHour[0]) * 60 + Integer.parseInt(secondStarHour[1]);
        String[] firstRateHour = io.getWord().split(":");
        int firstRate = Integer.parseInt(firstRateHour[0]) * 60 + Integer.parseInt(firstRateHour[1]);
        String[] secondRateHour = io.getWord().split(":");
        int secondRate = Integer.parseInt(secondRateHour[0]) * 60 + Integer.parseInt(secondRateHour[1]);

        boolean[] markers = new boolean[(int) 1e7];
        for (int i = firstStar; i < markers.length; i += firstRate) {
            markers[i] = true;
        }
        String[] days = new String[]{"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        for (int i = secondStar; i < markers.length; i += secondRate) {
            if (markers[i]) {
                int day = i / 24 / 60 % 7;
                io.println(days[day]);
                io.printf("%02d:%02d", i / 60 % 24, i % 60);
                io.close();
                return;
            }
        }

        io.print("Never");

        io.close();
    }
}

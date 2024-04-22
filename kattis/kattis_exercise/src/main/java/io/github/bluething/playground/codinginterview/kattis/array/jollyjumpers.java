package io.github.bluething.playground.codinginterview.kattis.array;

import io.github.bluething.playground.codinginterview.kattis.Kattio;

public class jollyjumpers {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        while (io.hasMoreTokens()) {
            long n = io.getLong();
            long[] sequence = new long[(int) n];
            for (int i = 0; i < n; i++) {
                sequence[i] = io.getLong();
            }

            boolean[] diffSeen = new boolean[(int) n];
            for (int i = 1; i < n; i++) {
                long diff = Math.abs(sequence[i] - sequence[i - 1]);
                if (diff >= 0 && diff < n) {
                    diffSeen[(int) diff] = true;
                }
            }

            boolean valid = true;
            for (int i = 1; i < n; i++) {
                valid &= diffSeen[i];
            }

            if (valid) {
                io.println("Jolly");
            } else {
                io.println("Not jolly");
            }
        }

        io.close();
    }
}

package io.github.bluething.playground.codinginterview.kattis.array;

import io.github.bluething.playground.codinginterview.kattis.Kattio;

public class fluortanten {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int numOfChild = io.getInt();
        // ignore Björn
        numOfChild--;
        int[] queue = new int[numOfChild];
        long sum = 0;
        for (int i = 0; i < numOfChild; i++) {
            queue[i] = io.getInt();
            if (queue[i] == 0) {
                queue[i] = io.getInt();
            }

            sum += (long) queue[i] * (i+1);
        }

        long curSum = 0;
        long bigSum = 0;
        for (int i = numOfChild - 1; i >= 0; i--) {
            curSum += queue[i];
            if (curSum > bigSum) {
                bigSum = curSum;
            }
        }

        io.println(bigSum + sum);

        io.close();
    }
}

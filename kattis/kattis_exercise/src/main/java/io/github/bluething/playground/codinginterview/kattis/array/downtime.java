package io.github.bluething.playground.codinginterview.kattis.array;

import io.github.bluething.playground.codinginterview.kattis.Kattio;

import java.util.HashMap;
import java.util.Map;

public class downtime {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int numOfRequest = io.getInt();
        int maxRps = io.getInt();
        Map<Integer, Integer> numOfConcurrentRequest = new HashMap<>();
        for (int i = 0; i < numOfRequest; i++) {
            int time = io.getInt();
            numOfConcurrentRequest.put(time, numOfConcurrentRequest.getOrDefault(time, 0) + 1);
        }
        int processing = 0;
        for (int i = 0; i < 1000; i++) {
            processing += numOfConcurrentRequest.getOrDefault(i, 0);
        }

        int maxProcessed = processing;
        for (int i = 1000; i <= 100000; i++) {
            processing += numOfConcurrentRequest.getOrDefault(i, 0);
            processing -= numOfConcurrentRequest.getOrDefault(i-1000, 0);
            maxProcessed = Math.max(maxProcessed, processing);
        }

        io.print((int)Math.ceil((double) maxProcessed /maxRps));

        io.close();
    }
}

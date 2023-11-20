package io.github.bluething.playground.codinginterview.kattis.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class teque2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numOfOps = Integer.parseInt(bufferedReader.readLine());
        String[] ops;
        String command;
        LinkedList<Integer> queueFront = new LinkedList<>();
        LinkedList<Integer> queueBack = new LinkedList<>();
        for (int i = 0; i < numOfOps; i++) {
            ops = bufferedReader.readLine().split(" ");
            command = ops[0];
            int x = Integer.parseInt(ops[1]);

            if ("push_back".equals(command)) {
                queueBack.offerLast(x);
                balancing(queueFront, queueBack);
            } else if ("push_front".equals(command)) {
                queueFront.offerFirst(x);
                balancing(queueFront, queueBack);
            } else if ("push_middle".equals(command)) {
                queueFront.offerLast(x);
                balancing(queueFront, queueBack);
            } else {
                if (queueFront.size() > x) {
                    System.out.println(queueFront.get(x));
                } else {
                    System.out.println(queueBack.get(x - queueFront.size()));
                }
            }
        }
    }

    private static void balancing(LinkedList<Integer> queueFront, LinkedList<Integer> queueBack) {
        int diff = queueFront.size() - queueBack.size();
        if (diff < 0) {
            double numOfRemove = (double) diff / -2;
            for (int i = 0; i < Math.ceil(numOfRemove); i++) {
                queueFront.offerLast(queueBack.pollFirst());
            }
        } else {
            double numOfRemove = (double) diff / 2;
            for (int i = 0; i < Math.floor(numOfRemove); i++) {
                queueBack.offerFirst(queueFront.pollLast());
            }
        }
    }
}

package io.github.bluething.playground.codinginterview.kattis.stack_queue;

import io.github.bluething.playground.codinginterview.kattis.Kattio;

import java.util.LinkedList;

public class teque2 {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int numOfOps = io.getInt();
        String command;
        LinkedList<Integer> queueFront = new LinkedList<>();
        LinkedList<Integer> queueBack = new LinkedList<>();
        for (int i = 0; i < numOfOps; i++) {
            command = io.getWord();
            int x = io.getInt();

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
                    io.println(queueFront.get(x));
                } else {
                    io.println(queueBack.get(x - queueFront.size()));
                }
            }
        }

        io.close();
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

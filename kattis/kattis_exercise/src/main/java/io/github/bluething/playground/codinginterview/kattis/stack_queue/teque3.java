package io.github.bluething.playground.codinginterview.kattis.stack_queue;

import io.github.bluething.playground.codinginterview.kattis.Kattio;

import java.util.Hashtable;

public class teque3 {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int numOfOps = io.getInt();
        String command;
        Hashtable<Integer, Integer> queueFront = new Hashtable<>();
        int queueFrontStart = -1;
        int queueFrontEnd = 0;
        Hashtable<Integer, Integer> queueBack = new Hashtable<>();
        int queueBackStart = -1;
        int queueBackEnd = 0;

        for (int i = 0; i < numOfOps; i++) {
            command = io.getWord();
            int x = io.getInt();

            if ("get".equals(command)) {
                if (x >= queueFront.size()) {
                    io.println(queueBack.get(x - queueFront.size() + queueBackStart + 1));
                } else {
                    io.println(queueFront.get(x + queueFrontStart + 1));
                }

                continue;
            }

            if ("push_back".equals(command)) {
                queueBack.put(queueBackEnd++, x);
            } else if ("push_front".equals(command)) {
                queueFront.put(queueFrontStart--, x);
            } else {
                queueFront.put(queueFrontEnd++, x);
            }

            if (queueBack.size() > queueFront.size()) {
                queueFront.put(queueFrontEnd, queueBack.get(queueBackStart + 1));
                queueFrontEnd++;
                queueBackStart++;
                queueBack.remove(queueBackStart);
            }
            if (queueFront.size() - 1 > queueBack.size()) {
                queueBack.put(queueBackStart, queueFront.get(queueFrontEnd - 1));
                queueBackStart--;
                queueFrontEnd--;
                queueFront.remove(queueFrontEnd);
            }
        }

        io.close();
    }
}

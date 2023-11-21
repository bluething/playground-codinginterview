package io.github.bluething.playground.codinginterview.kattis.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Hashtable;

public class teque3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numOfOps = Integer.parseInt(bufferedReader.readLine());
        String[] ops;
        String command;
        Hashtable<Integer, Integer> queueFront = new Hashtable<>();
        int queueFrontStart = -1;
        int queueFrontEnd = 0;
        Hashtable<Integer, Integer> queueBack = new Hashtable<>();
        int queueBackStart = -1;
        int queueBackEnd = 0;
        PrintWriter writer = new PrintWriter(System.out);
        for (int i = 0; i < numOfOps; i++) {
            ops = bufferedReader.readLine().split(" ");
            command = ops[0];
            int x = Integer.parseInt(ops[1]);

            if ("get".equals(command)) {
                if (x >= queueFront.size()) {
                    writer.println(queueBack.get(x - queueFront.size() + queueBackStart + 1));
                } else {
                    writer.println(queueFront.get(x + queueFrontStart + 1));
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

        writer.close();
    }
}

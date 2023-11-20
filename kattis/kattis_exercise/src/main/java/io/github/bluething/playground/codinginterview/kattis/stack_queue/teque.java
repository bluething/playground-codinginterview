package io.github.bluething.playground.codinginterview.kattis.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class teque {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numOfOps = Integer.parseInt(bufferedReader.readLine());
        String[] ops;
        String command;
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numOfOps; i++) {
            ops = bufferedReader.readLine().split(" ");
            command = ops[0];
            int x = Integer.parseInt(ops[1]);

            if ("push_back".equals(command)) {
                queue.addLast(x);
            } else if ("push_front".equals(command)) {
                queue.addFirst(x);
            } else if ("push_middle".equals(command)) {
                queue.add((queue.size()+1)/2, x);
            } else {
                System.out.println(queue.get(x));
            }
        }
    }
}

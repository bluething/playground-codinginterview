package io.github.bluething.playground.codinginterview.kattis.stack_queue;

import io.github.bluething.playground.codinginterview.kattis.Kattio;

import java.util.LinkedList;

public class teque {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int numOfOps = io.getInt();
        String command;
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numOfOps; i++) {
            command = io.getWord();
            int x = io.getInt();

            if ("push_back".equals(command)) {
                queue.addLast(x);
            } else if ("push_front".equals(command)) {
                queue.addFirst(x);
            } else if ("push_middle".equals(command)) {
                queue.add((queue.size()+1)/2, x);
            } else {
                io.println(queue.get(x));
            }
        }

        io.close();
    }
}

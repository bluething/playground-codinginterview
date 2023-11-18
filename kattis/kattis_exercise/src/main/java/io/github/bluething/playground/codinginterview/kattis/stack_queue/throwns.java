package io.github.bluething.playground.codinginterview.kattis.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class throwns {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = bufferedReader.readLine().split(" ");
        int numOfChildreen = Integer.parseInt(firstLine[0]);
        String[] commands = bufferedReader.readLine().split(" ");
        Deque<Integer> moves = new ArrayDeque<>();
        for (int i = 0; i < commands.length; i++) {
            if ("undo".equals(commands[i])) {
                int numOfUndo = Integer.parseInt(commands[++i]);
                while (numOfUndo-- > 0 && !moves.isEmpty()) {
                    moves.removeLast();
                }
            } else {
                int move = Integer.parseInt(commands[i]);
                moves.addLast(move);
            }
        }

        int lastPosition = 0;
        for (int move : moves) {
            lastPosition += move;
            lastPosition %= numOfChildreen;
            while (lastPosition < 0) {
                lastPosition += numOfChildreen;
            }
        }

        System.out.println(lastPosition);
    }
}

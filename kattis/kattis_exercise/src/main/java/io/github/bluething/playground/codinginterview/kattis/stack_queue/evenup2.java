package io.github.bluething.playground.codinginterview.kattis.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class evenup2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numOfCards = Integer.parseInt(bufferedReader.readLine());
        String[] cards = bufferedReader.readLine().split(" ");
        Stack<Integer> deck = new Stack<>();
        deck.push(Integer.valueOf(cards[0]));
        for (int i = 1; i < numOfCards; i++) {
            int card = Integer.parseInt(cards[i]);
            if (!deck.isEmpty() && (card + deck.peek()) % 2 == 0) {
                deck.pop();
            } else {
                deck.push(card);
            }
        }

        System.out.println(deck.size());
    }
}

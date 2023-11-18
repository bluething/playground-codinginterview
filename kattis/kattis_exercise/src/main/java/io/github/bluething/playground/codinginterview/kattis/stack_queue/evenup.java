package io.github.bluething.playground.codinginterview.kattis.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class evenup {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numOfCards = Integer.parseInt(bufferedReader.readLine());
        String[] cards = bufferedReader.readLine().split(" ");
        Stack<Integer> deck = new Stack<>();
        for (int i = cards.length-1; i >=0; i--) {
            deck.push(Integer.valueOf(cards[i]));
        }
        Stack<Integer> temp = new Stack<>();
        while (deck.size() > 1) {
            int card1 = deck.pop();
            int card2 = deck.pop();
            if ((card1 + card2) % 2 != 0) {
                temp.push(card1);
                deck.push(card2);
            } else {
                while (!temp.isEmpty()) {
                    deck.push(temp.pop());
                }
                numOfCards -= 2;
            }
        }

        System.out.println(numOfCards);
    }
}

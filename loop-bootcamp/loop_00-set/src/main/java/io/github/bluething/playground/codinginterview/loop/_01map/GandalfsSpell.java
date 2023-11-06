package io.github.bluething.playground.codinginterview.loop._01map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GandalfsSpell {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = bufferedReader.readLine().toCharArray();
        String[] sentences = bufferedReader.readLine().split(" ");
        if (chars.length != sentences.length) {
            System.out.println("False");
            return;
        }

        Map<Character, String> charToSentence =  new HashMap<>();
        boolean isMapped = true;
        for (int i = 0; i < chars.length; i++) {
            if (charToSentence.get(chars[i]) == null) {
                charToSentence.put(chars[i], sentences[i]);
            } else {
                if (!charToSentence.get(chars[i]).equals(sentences[i])) {
                    isMapped = false;
                    break;
                }
            }


        }

        // the map is valid, one to one between char to sentence
        // then we need to make sure the relation also one to one between sentence and char
        if (isMapped) {
            Set<Character> uniqueChar = new HashSet<>(charToSentence.keySet());
            Set<String> uniqueSentence = new HashSet<>(charToSentence.values());
            if (uniqueChar.size() == uniqueSentence.size()) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        } else {
            System.out.println("False");
        }
    }
}

package io.github.bluething.playground.codinginterview.kattis.hash_table;

import io.github.bluething.playground.codinginterview.kattis.Kattio;

public class nicknames {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        Node root = new Node();
        int A = io.getInt();
        while (A-- > 0) {
            String name = io.getWord();
            Node curr = root;
            for (char c : name.toCharArray()) {
                Node next = curr.children[c - 'a'];
                if (next == null) {
                    next = new Node();
                    curr.children[c - 'a'] = next;
                }
                ++next.count;
                curr = next;
            }
        }

        int B = io.getInt();
        while (B-- > 0) {
            String nickname = io.getWord();
            Node curr = root;
            for (char c : nickname.toCharArray()) {
                Node next = curr.children[c - 'a'];
                curr = next;
                if (curr == null) {
                    break;
                }
            }

            io.println(curr == null ? 0 : curr.count);
        }

        io.close();
    }
}

class Node {
    Node[] children = new Node[26];
    int count = 0;
}

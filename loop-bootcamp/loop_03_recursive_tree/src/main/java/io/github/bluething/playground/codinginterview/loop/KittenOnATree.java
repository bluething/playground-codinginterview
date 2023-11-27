package io.github.bluething.playground.codinginterview.loop;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class KittenOnATree {
    public static void main(String[] args) throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter printWriter = new PrintWriter(new BufferedOutputStream(System.out))
        ) {
            int kittenNode = Integer.parseInt(bufferedReader.readLine());
            Map<Integer, Integer> childParent = new HashMap<>();
            int rootNode;
            while (true) {
                StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                rootNode = Integer.parseInt(stringTokenizer.nextToken());
                if (rootNode == -1) {
                    break;
                }

                while (stringTokenizer.hasMoreTokens()) {
                    childParent.put(Integer.parseInt(stringTokenizer.nextToken()), rootNode);
                }
            }

            while (true) {
                printWriter.print(kittenNode);
                if (childParent.get(kittenNode) == null) {
                    break;
                }

                printWriter.print(" ");
                kittenNode = childParent.get(kittenNode);
            }
        }
    }
}

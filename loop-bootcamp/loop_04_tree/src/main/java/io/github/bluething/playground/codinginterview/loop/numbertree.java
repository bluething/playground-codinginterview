package io.github.bluething.playground.codinginterview.loop;

import java.io.*;

public class numbertree {
    public static void main(String[] args) throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter printWriter = new PrintWriter(new BufferedOutputStream(System.out))
        ) {
            String[] input = bufferedReader.readLine().split(" ");
            int height = Integer.parseInt(input[0]);
            long largestElement = (long) (Math.pow(2, height+1) -1);
            long subtract = 0;
            if (input.length > 1) {
                char[] paths = input[1].toCharArray();
                for (char path : paths) {
                    if ('L' == path) {
                        subtract = (subtract << 1) + 1;
                    } else {
                        subtract = (subtract << 1) + 2;
                    }
                }
            }

            printWriter.println(largestElement - subtract);
        }
    }
}

package io.github.bluething.playground.codinginterview.loop;

import java.io.*;
import java.util.Arrays;

public class swaptosort {
    public static int find(int[] d, int a) {
        if (d[a] == -1) return a;
        return d[a] = find(d, d[a]);
    }

    public static void join(int[] d, int a, int b) {
        a = find(d, a);
        b = find(d, b);
        if (a == b) return;
        d[a] = b;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter printWriter = new PrintWriter(new BufferedOutputStream(System.out))
        ) {
            String[] input = bufferedReader.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int k = Integer.parseInt(input[1]);

            int[] val = new int[n];
            Arrays.fill(val, -1);

            for (int i = 0; i < k; i++) {
                input = bufferedReader.readLine().split(" ");
                int a = Integer.parseInt(input[0]) - 1;
                int b = Integer.parseInt(input[1]) - 1;
                join(val, a, b);
            }

            boolean works = true;
            for (int i = 0; i < n; i++) {
                int c = find(val, i);
                int d = find(val, n - i - 1);
                if (c != d) {
                    works = false;
                }
            }

            if (works) {
                printWriter.println("Yes");
            } else {
                printWriter.println("No");
            }

        }
    }
}

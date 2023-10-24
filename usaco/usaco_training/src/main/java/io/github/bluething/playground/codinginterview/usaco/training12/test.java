package io.github.bluething.playground.codinginterview.usaco.training12;

import java.io.*;
import java.util.StringTokenizer;

/*
ID: habib.g1
LANG: JAVA
TASK: test
*/
class test {
    public static void main(String[] args) throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("test.in"));
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("test.out")))
            ) {

            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i1 = Integer.parseInt(stringTokenizer.nextToken());
            int i2 = Integer.parseInt(stringTokenizer.nextToken());

            printWriter.println(i1+i2);
        }
    }
}

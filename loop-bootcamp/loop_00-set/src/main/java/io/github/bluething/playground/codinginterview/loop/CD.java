package io.github.bluething.playground.codinginterview.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CD {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = bufferedReader.readLine();

            String[] inputParts = input.split(" ");
            int jackCd = Integer.parseInt(inputParts[0]);
            int jillCd = Integer.parseInt(inputParts[1]);
            if (jackCd == 0 && jillCd == 0) {
                return;
            }

            int[] catalogs = new int[jackCd];
            for (int i = 0; i < catalogs.length; i++) {
                catalogs[i] = Integer.parseInt(bufferedReader.readLine());
            }
            int numOfSell = 0;
            int catalog = 0;
            int pointer = 0;
            for (int i = 0; i < jillCd; i++) {
                catalog = Integer.parseInt(bufferedReader.readLine());
                while (pointer < jackCd && catalogs[pointer] < catalog) {
                    pointer++;
                }
                if (pointer < jackCd && catalogs[pointer] == catalog) {
                    pointer++;
                    numOfSell++;
                }
            }

            System.out.println(numOfSell);
        }
    }
}

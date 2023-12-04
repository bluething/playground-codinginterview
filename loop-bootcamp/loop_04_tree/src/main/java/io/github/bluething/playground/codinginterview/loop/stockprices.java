package io.github.bluething.playground.codinginterview.loop;

import java.io.*;
import java.util.Collections;
import java.util.TreeMap;

public class stockprices {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter printWriter = new PrintWriter(new BufferedOutputStream(System.out))
        ) {
            int numOfTestCases = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < numOfTestCases; i++) {
                int numOfTrades = Integer.parseInt(bufferedReader.readLine());

                // desc
                TreeMap<Integer, Integer> buyPrices = new TreeMap<>(Collections.reverseOrder());
                // asc
                TreeMap<Integer, Integer> sellPrices = new TreeMap<>();
                String tradeType;
                int numOfShare;
                int priceShare;
                int tradePrice = -1;

                for (int j = 0; j < numOfTrades; j++) {
                    String[] input = bufferedReader.readLine().split(" ");

                    tradeType = input[0];
                    numOfShare = Integer.parseInt(input[1]);
                    priceShare = Integer.parseInt(input[4]);

                    if ("buy".equals(tradeType)) {
                        buyPrices.put(priceShare, buyPrices.getOrDefault(priceShare, 0) + numOfShare);
                    } else {
                        sellPrices.put(priceShare, sellPrices.getOrDefault(priceShare, 0) + numOfShare);
                    }

                    // buyPrices.firstKey() >= sellPrices.firstKey() is a rule for reaching an agreement
                    while (!buyPrices.isEmpty() && !sellPrices.isEmpty() && buyPrices.firstKey() >= sellPrices.firstKey()) {
                        tradePrice = sellPrices.firstKey();
                        int shareAmount = Math.min(sellPrices.firstEntry().getValue(), buyPrices.firstEntry().getValue());

                        // adjust share amount for each top element
                        sellPrices.put(sellPrices.firstKey(), sellPrices.firstEntry().getValue() - shareAmount);
                        if (sellPrices.get(sellPrices.firstKey()) == 0) {
                            sellPrices.remove(sellPrices.firstKey());
                        }
                        buyPrices.put(buyPrices.firstKey(), buyPrices.firstEntry().getValue() - shareAmount);
                        if (buyPrices.get(buyPrices.firstKey()) == 0) {
                            buyPrices.remove(buyPrices.firstKey());
                        }
                    }

                    if (!sellPrices.isEmpty()) {
                        printWriter.print(sellPrices.firstKey() + " ");
                    } else {
                        printWriter.print("- ");
                    }

                    if (!buyPrices.isEmpty()) {
                        printWriter.print(buyPrices.firstKey() + " ");
                    } else {
                        printWriter.print("- ");
                    }

                    if (tradePrice != -1) {
                        printWriter.print(tradePrice + " ");
                    } else {
                        printWriter.print("- ");
                    }
                    printWriter.println();
                }
            }
        }
    }
}

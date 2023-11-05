package io.github.bluething.playground.codinginterview.loop._01map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Conformity {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numOfFrosh = Integer.parseInt(bufferedReader.readLine());
        String courses;
        Map<String, Integer> froshCounter = new HashMap<>();
        int maxNumOfFrosh = Integer.MIN_VALUE;
        int[] courseInt = new int[5];
        StringBuilder sb;
        for (int i = 0; i < numOfFrosh; i++) {
            courses = bufferedReader.readLine();
            int j = 0;
            for (String course : courses.split(" ")) {
                courseInt[j] = Integer.parseInt(course);
                j++;
            }
            Arrays.sort(courseInt);
            sb = new StringBuilder();
            for (j = 0; j < courseInt.length; j++) {
                sb.append(courseInt[j]);
            }
            froshCounter.put(sb.toString(), froshCounter.getOrDefault(sb.toString(), 0) + 1);
            maxNumOfFrosh = Math.max(maxNumOfFrosh, froshCounter.get(sb.toString()));
        }
        int numOfWinner = 0;
        for (Map.Entry<String, Integer> entry : froshCounter.entrySet()) {
            if (entry.getValue() == maxNumOfFrosh) {
                numOfWinner += entry.getValue();
            }
        }
        System.out.println(numOfWinner);
    }
}

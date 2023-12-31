package io.github.bluething.playground.codinginterview.kattis.hash_table;

import io.github.bluething.playground.codinginterview.kattis.Kattio;

import java.util.*;

public class grandpabernie {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int numOfTrips = io.getInt();
        Map<String, List<Integer>> granpaTrips = new HashMap<>();
        while (numOfTrips-- > 0) {
            String country = io.getWord();
            int year = io.getInt();
            if (!granpaTrips.containsKey(country)) {
                granpaTrips.put(country, new ArrayList<>());
            }
            granpaTrips.get(country).add(year);
        }

        int numOfQuery = io.getInt();
        Set<String> visited = new HashSet<>();
        while (numOfQuery-- > 0) {
            String country = io.getWord();
            int trip = io.getInt();
            if (visited.add(country)) {
                Collections.sort(granpaTrips.get(country));
            }
            io.println(granpaTrips.get(country).get(trip-1));
        }

        io.close();
    }
}

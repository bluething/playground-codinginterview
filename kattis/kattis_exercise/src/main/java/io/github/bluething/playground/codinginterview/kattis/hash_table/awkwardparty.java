package io.github.bluething.playground.codinginterview.kattis.hash_table;

import io.github.bluething.playground.codinginterview.kattis.Kattio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class awkwardparty {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        long numOfGuest = io.getLong();
        Map<Long, List<Long>> guestPositions = new HashMap<>();
        for (long i = 0; i < numOfGuest; i++) {
            long guest = io.getLong();
            if (!guestPositions.containsKey(guest)) {
                guestPositions.put(guest, new ArrayList<>());
            }

            guestPositions.get(guest).add(i);
        }

        long answer = numOfGuest;
        for (Map.Entry<Long, List<Long>> entry : guestPositions.entrySet()) {
            List<Long> positions = entry.getValue();
            for (int i = 1; i < positions.size(); i++) {
                answer = Math.min(answer, positions.get(i) - positions.get(i-1));
            }
        }
        io.println(answer);

        io.close();
    }

}

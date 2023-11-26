package io.github.bluething.playground.codinginterview.loop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Capsules {

    static Kattio io;
    static int row;
    static int col;
    static List<List<Character>> capsules;
    static List<Region> regions;
    public static void main(String[] args) {
        io = new Kattio(System.in, System.out);
        row = io.getInt();
        col = io.getInt();

        capsules = new ArrayList<>();
        for (int i = 0; i < row+2; i++) {
            capsules.add(new ArrayList<>(Collections.nCopies(col+2, '-')));
        }
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                capsules.get(i).set(j, io.getWord().charAt(0));
            }
        }

        int numOfRegion = io.getInt();
        regions = new ArrayList<>();
        for (int i = 0; i < numOfRegion; i++) {
            int regionId = io.getInt();
            Region region = new Region(regionId);

            for (int j = 1; j <= regionId; j++) {
                String pair = io.getWord();
                int x = Character.getNumericValue(pair.charAt(1));
                int y = Character.getNumericValue(pair.charAt(3));

                if ('-' == capsules.get(x).get(y)) {
                    region.coordinate.add(Map.of('x', x, 'y', y));
                } else {
                    region.used.set(capsules.get(x).get(y) - '0', true);
                }
            }

            regions.add(region);
        }

        solve(0, 0);

        io.close();
    }

    private static boolean isWorks(int x, int y) {
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;
                if (capsules.get(x + i).get(y + j) == capsules.get(x).get(y)) return false;
            }
        }
        return true;
    }

    private static void solve(int currentRegion, int currentSpot) {
        if (currentRegion == regions.size()) {
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= col; j++) {
                    io.print(capsules.get(i).get(j) + " ");
                }
                io.println();
            }
            return;
        }

        if (regions.get(currentRegion).coordinate.size() == currentSpot) {
            solve(currentRegion+1, 0);
            return;
        }

        for (int i = 1; i <= regions.get(currentRegion).id; i++) {
            if (regions.get(currentRegion).used.get(i)) {
                continue;
            }

            Map<Character, Integer> candidate = regions.get(currentRegion).coordinate.get(currentSpot);
            capsules.get(candidate.get('x')).set(candidate.get('y'), (char) (i + '0'));
            regions.get(currentRegion).used.set(i, true);

            if (isWorks(candidate.get('x'), candidate.get('y'))) {
                solve(currentRegion, currentSpot+1);
            }

            regions.get(currentRegion).used.set(i, false);
            capsules.get(candidate.get('x')).set(candidate.get('y'), '-');
        }
    }
}

class Region {
    int id;
    List<Boolean> used;
    List<Map<Character, Integer>> coordinate;

    public Region(int id) {
        this.id = id;
        this.used = new ArrayList<>(Collections.nCopies(8, false));
        this.coordinate = new ArrayList<>();
    }
}

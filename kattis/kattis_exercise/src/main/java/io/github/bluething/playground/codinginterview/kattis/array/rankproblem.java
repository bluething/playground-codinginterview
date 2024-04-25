package io.github.bluething.playground.codinginterview.kattis.array;

import io.github.bluething.playground.codinginterview.kattis.Kattio;

public class rankproblem {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int m = io.getInt();
        String[] teams = new String[n];
        for (int i = 0; i < n; i++) {
            teams[i] = "T" + (i + 1);
        }
        while (m-- > 0) {
            String winner = io.getWord();
            int winnerIdx = getIndex(teams, winner);
            String looser = io.getWord();
            int looserIdx = getIndex(teams, looser);

            if (winnerIdx > looserIdx) {
                rearrange(teams, winnerIdx, looserIdx);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(teams[i]).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        io.println(sb);

        io.close();
    }

    private static int getIndex(String[] teams, String team) {
        for (int i = 0; i < teams.length; i++) {
            if (teams[i].equals(team)) {
                return i;
            }
        }
        return -1;
    }

    private static void rearrange(String[] teams, int winnerIdx, int looserIdx) {
        String temp = teams[looserIdx];
        while (looserIdx < winnerIdx) {
            teams[looserIdx] = teams[++looserIdx];
        }
        teams[winnerIdx] = temp;
    }
}

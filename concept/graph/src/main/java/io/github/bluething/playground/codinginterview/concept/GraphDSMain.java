package io.github.bluething.playground.codinginterview.concept;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class GraphDSMain {
    public static void main(String[] args) throws IOException {
        try (InputStream is = GraphDSMain.class.getClassLoader().getResourceAsStream("graph_ds.txt")) {
            Scanner sc = new Scanner(Objects.requireNonNull(is));

            // 1st we need to know the size
            // if N > 100, try not to use adjacency matrix

            // adjacency matrix
            // AM[i][j] = edge weight from i to j
            // 0 means no connection between i and j
            int N = sc.nextInt();

            int[][] AM = new int[N][];
            for (int i = 0; i < N; i++) {
                AM[i] = new int[N];
                for (int j = 0; j < N; j++) {
                    AM[i][j] = sc.nextInt();
                }
            }

            System.out.println("Adjacency Matrix");
            System.out.println("Neighbors of vertex 0:");
            for (int i = 0; i < N; i++) {
                if (AM[0][i] != 0) {
                    System.out.println("Edge 0-" + i + " (weight = " + AM[0][i] + ")");
                }
            }

            // adjacency list
            // for each vertex i, AL[i] stores the list of i's neighbors
            N = sc.nextInt();
            List<List<IntegerPair>> AL = new ArrayList<>(N);
            for (int i = 0; i < N; i++) {   // for each vertex
                List<IntegerPair> neighbors = new ArrayList<>();
                AL.add(neighbors);
                int totalNeighbors = sc.nextInt();
                while (totalNeighbors-- > 0) {
                    int vertex = sc.nextInt()-1; // 0-based index
                    int weight = sc.nextInt();
                    AL.get(i).add(new IntegerPair(vertex, weight));
                }
            }

            System.out.println("Adjacency List");
            System.out.println("Neighbors of vertex 0:");
            for (IntegerPair v_w : AL.get(0)) {
                int v = v_w.first(), w = v_w.second();
                System.out.println("Edge 0-" + v + " (weight = " + w + ")");
            }

            //  edge list
            N = sc.nextInt();
            List<IntegerTriple> EL = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                int u = sc.nextInt();
                int vertex = sc.nextInt();
                int weight = sc.nextInt();
                EL.add(new IntegerTriple(weight, u, vertex));
            }

            // edges sorted by weight (smallest->largest)
            Collections.sort(EL);
            System.out.println("Edge List");
            for (int i = 0; i < N; i++) {
                IntegerTriple edge = EL.get(i);
                System.out.println("weight: " + edge.first() + " (" + edge.second() + "-" + edge.third() + ")");
            }
        }
    }
}

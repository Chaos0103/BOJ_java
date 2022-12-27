package g3;

import java.util.*;

public class P1613 {

    private static final int INF = (int) 1e9;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] graph = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(graph[i], INF);
        }

        for (int i = 0; i < k; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = 1;
        }

        for (int i = 1; i <= n; i++) {
            graph[i][i] = 0;
        }

        for (int a = 1; a <= n; a++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][a] + graph[a][j]);
                }
            }
        }

        int s = sc.nextInt();
        for (int i = 0; i < s; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (graph[x][y] == INF && graph[y][x] == INF) {
                System.out.println(0);
            } else if (graph[x][y] == INF) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        }
    }
}

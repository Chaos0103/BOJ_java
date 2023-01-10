package g4;

import java.util.*;

public class P14938 {
    private static int INF = (int) 1e9;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();

        int[] items = new int[n + 1];
        for(int i = 0; i < n; i++) {
            items[i] = sc.nextInt();
        }

        int[][] graph = new int[n + 1][n + 1];
        for(int i = 0; i <= n; i++) {
            Arrays.fill(graph[i], INF);
        }

        for(int i = 1; i <= n; i++) {
            graph[i][i] = 0;
        }

        for(int i = 0; i < r; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int l = sc.nextInt();
            graph[a][b] = l;
            graph[b][a] = l;
        }

        for(int k = 1; k <= n; k++) {
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n; j++) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
                }
            }
        }

        int result = 0;
        for(int i = 1; i <= n; i++) {
            int count = 0;
            for(int j = 1; j <= n; j++) {
                if (graph[i][j] <= m) {
                    count += items[j - 1];
                }
            }
            result = Math.max(result, count);
        }

        System.out.println(result);
    }
}

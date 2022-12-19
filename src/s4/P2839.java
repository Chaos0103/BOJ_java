package s4;

import java.util.Arrays;
import java.util.Scanner;

public class P2839 {

    private static final int INF = (int) 1e9;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] dp = new int[n + 1];
        Arrays.fill(dp, INF);
        dp[3] = 1;
        if (n > 4) {
            dp[5] = 1;
        }
        for (int i = 6; i <= n; i++) {
            dp[i] = Math.min(dp[i - 3], dp[i - 5]) + 1;
        }

        if (dp[n] >= INF) {
            System.out.println(-1);
        } else {
            System.out.println(dp[n]);
        }
    }
}

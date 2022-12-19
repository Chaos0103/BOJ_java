package s4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> coins = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int coin = sc.nextInt();
            coins.add(coin);
        }

        Collections.reverse(coins);

        int result = 0;
        for (Integer coin : coins) {
            result += k / coin;
            k %= coin;
        }
        System.out.println(result);
    }
}

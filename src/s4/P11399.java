package s4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            data.add(number);
        }

        Collections.sort(data);

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += (n - i) * data.get(i);
        }
        System.out.println(result);

    }
}

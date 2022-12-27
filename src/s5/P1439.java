package s5;

import java.util.*;

public class P1439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int result = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                result++;
            }
        }

        System.out.println(result / 2);
    }
}

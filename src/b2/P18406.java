package b2;

import java.util.*;

public class P18406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        int length = n.length();
        int left = Integer.parseInt(n.substring(0, length / 2));
        int right = Integer.parseInt(n.substring(length / 2));

        int result = 0;
        while (left != 0 && right != 0) {
            result += left % 10;
            left /= 10;
            result -= right % 10;
            right /= 10;
        }

        if (result == 0) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
    }
}

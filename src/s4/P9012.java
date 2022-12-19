package s4;

import java.util.*;

public class P9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            String result = "YES";
            Stack<Character> stack = new Stack<>();
            for (char ch : str.toCharArray()) {
                if (ch == '(') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        result = "NO";
                        break;
                    }
                }
            }
            if (!stack.isEmpty()) {
                result = "NO";
            }
            System.out.println(result);
        }
    }
}

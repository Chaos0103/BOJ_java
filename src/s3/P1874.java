package s3;

import java.util.*;

public class P1874 {

    private static final Stack<Integer> stack = new Stack<>();
    private static final List<Integer> orders = new ArrayList<>();
    private static final List<String> results = new ArrayList<>();
    private static int NUMBER = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            orders.add(num);
        }

        for (int order : orders) {
            while (NUMBER <= order) {
                stack.push(NUMBER++);
                results.add("+");
            }
            if (stack.peek() == order) {
                stack.pop();
                results.add("-");
            } else {
                System.out.println("NO");
                return;
            }
        }

        for (String result : results) {
            System.out.println(result);
        }
    }
}

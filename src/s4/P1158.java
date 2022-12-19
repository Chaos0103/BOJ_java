package s4;

import java.util.*;

public class P1158 {

    private static final Queue<Integer> q = new LinkedList<>();
    private static final List<Integer> results = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        int count = 0;
        while (!q.isEmpty()) {
            count++;
            Integer number = q.poll();
            if (count % k == 0) {
                results.add(number);
            } else {
                q.offer(number);
            }
        }
        String s = results.toString();
        s = s.replace('[', '<').replace(']', '>');
        System.out.println(s);
    }
}

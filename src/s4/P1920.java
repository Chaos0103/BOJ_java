package s4;

import java.util.*;

public class P1920 {
    private static final List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            numbers.add(number);
        }

        Collections.sort(numbers);

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int number = sc.nextInt();
            if (binary_search(number)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    private static boolean binary_search(int target) {
        int left = 0;
        int right = numbers.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers.get(mid) < target) {
                left = mid + 1;
            } else if (numbers.get(mid) == target) {
                return true;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}

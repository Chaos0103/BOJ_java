package s4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P10845 {

    private static final Deque<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        FastReader fr = new FastReader();

        int n = fr.nextInt();

        for (int i = 0; i < n; i++) {
            String[] data = fr.nextLine().split(" ");
            switch (data[0]) {
                case "push":
                    queue.offer(Integer.parseInt(data[1]));
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        int number = queue.poll();
                        System.out.println(number);
                    }
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        int number = queue.peekFirst();
                        System.out.println(number);
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        int number = queue.peekLast();
                        System.out.println(number);
                    }
                    break;
            }
        }

    }

    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}

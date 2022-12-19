package s4;

import java.io.*;
import java.util.*;

public class P10866 {

    private static final Deque<Integer> dq = new ArrayDeque<>();

    public static void main(String[] args) {
        FastReader fr = new FastReader();

        int n = fr.nextInt();

        for (int i = 0; i < n; i++) {
            String[] data = fr.nextLine().split(" ");
            switch (data[0]) {
                case "push_front":
                    dq.offerFirst(Integer.valueOf(data[1]));
                    break;
                case "push_back":
                    dq.offerLast(Integer.valueOf(data[1]));
                    break;
                case "pop_front":
                    if (dq.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        Integer number = dq.pollFirst();
                        System.out.println(number);
                    }
                    break;
                case "pop_back":
                    if (dq.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        Integer number = dq.pollLast();
                        System.out.println(number);
                    }
                    break;
                case "size":
                    System.out.println(dq.size());
                    break;
                case "empty":
                    if (dq.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "front":
                    if (dq.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        Integer number = dq.peekFirst();
                        System.out.println(number);
                    }
                    break;
                case "back":
                    if (dq.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        Integer number = dq.peekLast();
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

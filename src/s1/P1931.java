package s1;

import java.util.*;

class Node implements Comparable<Node> {
    private int start;
    private int end;

    public Node(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    @Override
    public int compareTo(Node other) {
        if (this.start < other.start) {
            return -1;
        } else if (this.start == other.start) {
            if (this.end < other.end) {
                return -1;
            }
        }
        return 1;
    }
}

public class P1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Node> nodes = new ArrayList<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            nodes.add(new Node(s, e));
        }

        Collections.sort(nodes);

        int count = 1;
        Node now = nodes.get(0);
        for (int i = 1; i < n; i++) {
            if (now.getEnd() <= nodes.get(i).getStart()) {
                count++;
                now = nodes.get(i);
            }
            if (now.getEnd() > nodes.get(i).getEnd()) {
                now = nodes.get(i);
            }
        }
        System.out.println(count);
    }
}

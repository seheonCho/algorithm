package boj.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class 절댓값_힙 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);
            if (abs1 == abs2) {
                if (o1 > o2) {
                    return 1;
                } else {
                    return -1;
                }
            }
            return abs1 - abs2;
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {

            int x = Integer.parseInt(br.readLine());

            if (x == 0) {

                if (queue.isEmpty()) {
                    sb.append(0);
                } else {
                    sb.append(queue.poll());
                }
                sb.append("\n");

            } else {
                queue.add(x);
            }
        }

        System.out.println(sb);

    }

}

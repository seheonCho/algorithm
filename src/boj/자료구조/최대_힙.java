package boj.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class 최대_힙 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue queue = new PriorityQueue(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {

            int input = Integer.parseInt(br.readLine());

            if (input == 0) {
                if (queue.isEmpty()) {
                    sb.append(0);
                } else {
                    sb.append(queue.poll());
                }
                sb.append("\n");
            } else {
                queue.add(input);
            }

        }

        System.out.println(sb);

    }

}

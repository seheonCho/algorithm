package boj.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class 가운데를_말해요 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> smallQueue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> bigQueue = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {

            int num = Integer.parseInt(br.readLine());

            if (smallQueue.size() > bigQueue.size()) {
                bigQueue.add(num);
            } else {
                smallQueue.add(num);
            }

            Integer smallQueuePeek = smallQueue.peek();
            Integer bigQueuePeek = bigQueue.peek();

            if (smallQueuePeek == null) smallQueuePeek = 0;
            if (bigQueuePeek == null) bigQueuePeek = 0;

            if (smallQueuePeek > bigQueuePeek &&
                        !smallQueue.isEmpty() &&
                          !bigQueue.isEmpty()) {

                Integer smallQueueOutNum = smallQueue.poll();
                Integer bigQueueOutNum = bigQueue.poll();

                smallQueue.add(bigQueueOutNum);
                bigQueue.add(smallQueueOutNum);
            }

            sb.append(smallQueue.peek()).append('\n');

        }

        System.out.println(sb);

    }

}

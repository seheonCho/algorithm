package boj.자료구조;

import java.util.*;

public class 요세푸스_문제 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (queue.size() > 1) {
            for (int i = 0; i < K - 1; i++) {
                int indexNum = queue.poll();
                queue.offer(indexNum);
            }
            sb.append(queue.poll()).append(", ");
        }

        sb.append(queue.poll()).append(">");
        System.out.println(sb);
    }

}

package boj.자료구조;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringJoiner;

public class 요세푸스_문제_0 {

    public static void main(String[] args) {
        // Queue 로 순환시키자
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) queue.add(i);

        StringJoiner sj = new StringJoiner(", ", "<", ">");

        while (!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i++){
                queue.add(queue.poll());
            }

            sj.add(String.valueOf(queue.poll()));
        }

        System.out.println(sj);

    }

}

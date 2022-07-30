package boj.자료구조;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class 카드2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Deque queue = new ArrayDeque();

        for (int i = 1; i <= N; i++) queue.add(i);

        while (queue.size() != 1) {
            queue.poll();
            queue.addLast(queue.poll());
        }

        System.out.println(queue.poll());

    }

}
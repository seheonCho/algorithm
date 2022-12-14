package boj.백트래킹;

import java.util.Scanner;

public class No_15649 {

    private static boolean[] isVisit;
    private static int[] arr;
    private static int N;
    private static int M;

    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        String[] inputs = input.split(" ");

        N = Integer.parseInt(inputs[0]);
        M = Integer.parseInt(inputs[1]);

        isVisit = new boolean[N + 1];
        arr = new int[M];

        backTracking(0);

    }

    private static void backTracking(int num) {

        if (num == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!isVisit[i]) {
                arr[num] = i;
                isVisit[i] = true;
                backTracking(num + 1);
                isVisit[i] = false;
            }
        }
    }

}

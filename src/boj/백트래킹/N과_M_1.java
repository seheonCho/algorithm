package boj.백트래킹;

import java.util.Scanner;

public class N과_M_1 {

    public static boolean[] visit;
    public static int[] numbers;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numberN = in.nextInt(); // 수의 최대값
        int numberM = in.nextInt(); // 열의 숫자 갯수

        visit = new boolean[numberN];
        numbers = new int[numberM];

        dfs(numberN, numberM, 0);

    }
    //                                                           dfs(4, 4, 0)
    // visit[true, false, false, false] || number[1, 0, 0, 0] || dfs(4, 4, 1)
    // visit[true, true, false, false]  || number[1, 2, 0, 0] || dfs(4, 4, 2)
    // visit[true, true, true, false]   || number[1, 2, 3, 0] || dfs(4, 4, 3)
    // visit[true, true, true, true]    || number[1, 2, 3, 4] || dfs(4, 4, 4)
    public static void dfs(int N, int M, int depth) { // N, M, 반복횟수(depth)

        if (depth == M) {

            for (int num : numbers) {
                System.out.print(num + " ");
            }

            System.out.println();

            return;

        }

        for (int i = 0; i < N; i++) { //수의 범위가 1 ~ numberN

            if (!visit[i]) {

                visit[i] = true;
                numbers[depth] = i + 1;
                dfs(N, M, depth + 1);
                visit[i] = false; // 자식노드 방문종료시, 방문노드를 false로 초기화

            }
        }

    }

}

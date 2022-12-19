package boj.백트래킹;

import java.util.Scanner;

public class No_9663 {

    private static int N;
    private static int[] CHESS_BOARD;
    private static int ANSWER_COUNT = 0;

    public static void main(String[] args) {
        N = new Scanner(System.in).nextInt();
        CHESS_BOARD = new int[N];

        dfs(0);
        System.out.println(ANSWER_COUNT);
    }

    private static void dfs(int depth) {
        if (depth == N) {
            ANSWER_COUNT++;
            return;
        }

        for (int i = 0; i < N; i++) {
            CHESS_BOARD[depth] = i;
            if (isAcceptRule(depth)) {
                dfs(depth + 1);
            }
        }
    }

    private static boolean isAcceptRule(int columnIndex) {
        for (int j = 0; j < columnIndex; j++) {
            if (CHESS_BOARD[columnIndex] == CHESS_BOARD[j]) {
                return false;
            }

            if (Math.abs(columnIndex - j) == Math.abs(CHESS_BOARD[columnIndex] - CHESS_BOARD[j])) {
                return false;
            }
        }
        return true;
    }

}

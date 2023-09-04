package boj.깊이우선탐색_너비우선탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class No_5014 {

    private static final String NO_ANSWER = "use the stairs";
    private static final int NO_ANSWER_NUMBER = -1;
    private static int F;
    private static int S;
    private static int G;
    private static int U;
    private static int D;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        F = Integer.parseInt(inputs[0]);//총 층
        S = Integer.parseInt(inputs[1]);//현재층
        G = Integer.parseInt(inputs[2]);//목표 층
        U = Integer.parseInt(inputs[3]);//위로가는 층수
        D = Integer.parseInt(inputs[4]);//아래로가는 층수

        int minMoveCount = bfs(F, S, G);
        if (minMoveCount == NO_ANSWER_NUMBER) {
            System.out.println(NO_ANSWER);
        } else {
            System.out.println(minMoveCount);
        }
    }

    private static int bfs(int f, int s, int g) {
        Queue<Integer> minMoves = new LinkedList<>();
        minMoves.add(s);
        int[] moveCounts = new int[f + 1];
        moveCounts[s] = 1;

        while (!minMoves.isEmpty()) {
            int now = minMoves.poll();
            if (now == g) {
                return moveCounts[now] - 1;
            }

            int nextUp = now + U;
            int nextDown = now - D;

            if (nextUp <= f) {
                if (moveCounts[nextUp] == 0) {
                    moveCounts[nextUp] = moveCounts[now] + 1;
                    minMoves.add(nextUp);
                }
            }

            if (nextDown > 0) {
                if (moveCounts[nextDown] == 0) {
                    moveCounts[nextDown] = moveCounts[now] + 1;
                    minMoves.add(nextDown);
                }
            }

        }

        return NO_ANSWER_NUMBER;
    }

}

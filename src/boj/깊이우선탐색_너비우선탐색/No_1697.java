package boj.깊이우선탐색_너비우선탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class No_1697 {

    static int N;
    static int K;
    static int MIN;
    static int[] distances;
    static boolean[] isVisits;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);
        MIN = Integer.MIN_VALUE;
        distances = new int[100_001];
        isVisits = new boolean[100_001];
        Arrays.fill(distances, Integer.MAX_VALUE);

        bfs(N, K);
        System.out.println(distances[K]);
    }

    private static void bfs(int now, int limit) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(now, 0));

        while (!queue.isEmpty()) {
            Pair pollSpot = queue.poll();

            int pollIndex = pollSpot.index;
            int pollTimes = pollSpot.times;

            if (validateRange(pollIndex)) {
                distances[pollIndex] = Math.min(distances[pollIndex], pollTimes);
                isVisits[pollIndex] = true;
            }

            if (pollIndex == K) {
                break;
            }

            int nextRight = pollIndex + 1;
            int nextLeft = pollIndex - 1;
            int nextJump = pollIndex * 2;

            if (validateRange(nextRight)) {
                distances[nextRight] = distances[pollIndex] + 1;
                queue.add(new Pair(nextRight, distances[pollIndex] + 1));
            }

            if (validateRange(nextLeft)) {
                distances[nextLeft] = distances[pollIndex] + 1;
                queue.add(new Pair(nextLeft, distances[pollIndex] + 1));
            }

            if (validateRange(nextJump)) {
                distances[nextJump] = distances[pollIndex] + 1;
                queue.add(new Pair(nextJump, distances[pollIndex] + 1));
            }

        }

    }

    private static boolean validateRange(int pollIndex) {
        return pollIndex >= 0 && pollIndex <= 100000 && !isVisits[pollIndex];
    }

    static class Pair {
        int index;
        int times;

        public Pair(int index, int times) {
            this.index = index;
            this.times = times;
        }
    }

}

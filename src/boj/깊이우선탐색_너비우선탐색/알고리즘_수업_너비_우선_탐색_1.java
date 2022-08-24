package boj.깊이우선탐색_너비우선탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 알고리즘_수업_너비_우선_탐색_1 {

    static List<ArrayList<Integer>> graph;
    static int N;
    static int M;
    static int R;
    static int[] visitSeq;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        graph = new ArrayList<>(N + 1);
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        visitSeq = new int[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            graph.get(first).add(second);
            graph.get(second).add(first);
        }

        for (int i = 1; i <= N; i++) Collections.sort(graph.get(i));

        bfs(R);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(visitSeq[i] + "\n");
        }
        System.out.println(sb);
    }

    private static void bfs(int start) {

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        int seq = 1;
        visitSeq[start] = seq++;

        while (!queue.isEmpty()) {
            int num = queue.poll();

            for (int i = 0; i < graph.get(num).size(); i++) {
                int getNum = graph.get(num).get(i);

                if (visitSeq[getNum] != 0) continue;

                queue.add(getNum);
                visitSeq[getNum] = seq++;

            }
        }

    }
}


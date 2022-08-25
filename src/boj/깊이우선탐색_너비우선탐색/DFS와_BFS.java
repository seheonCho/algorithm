package boj.깊이우선탐색_너비우선탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DFS와_BFS {

    static int N;
    static int M;
    static int START;
    static List<List<Integer>> GRAPH;
    static boolean[] isVisit;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        START = Integer.parseInt(st.nextToken());

        GRAPH = new ArrayList<>(N + 1);
        isVisit = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            GRAPH.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            GRAPH.get(first).add(second);
            GRAPH.get(second).add(first);
        }

        for (int i = 1; i <= N; i++) Collections.sort(GRAPH.get(i));

        sb = new StringBuilder();

        dfs(START);
        System.out.println(sb);

        isVisit = new boolean[N + 1];

        sb = new StringBuilder();

        bfs(START);
        System.out.println(sb);

    }

    private static void dfs(int point) {
        isVisit[point] = true;
        sb.append(point + " ");

        for (int i = 0; i < GRAPH.get(point).size(); i++) {

            int nextNum = GRAPH.get(point).get(i);

            if (!isVisit[nextNum]) {
                isVisit[nextNum] = true;
                dfs(nextNum);
            }
        }

    }

    private static void bfs(int start) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        isVisit[start] = true;
        sb.append(start + " ");

        while (!queue.isEmpty()) {

            int targetNum = queue.poll();

            for (int i = 0; i < GRAPH.get(targetNum).size(); i++) {
                int nextNum = GRAPH.get(targetNum).get(i);

                if (!isVisit[nextNum]) {
                    queue.add(nextNum);
                    isVisit[nextNum] = true;
                    sb.append(nextNum + " ");
                }
            }
        }
    }

}

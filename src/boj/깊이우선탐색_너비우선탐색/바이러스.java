package boj.깊이우선탐색_너비우선탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 바이러스 {

    static boolean[][] graph;
    static boolean[] isVisit;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computerNum = Integer.parseInt(br.readLine());
        int computerPairNum = Integer.parseInt(br.readLine());
        graph = new boolean[computerNum + 1][computerNum + 1];
        isVisit = new boolean[computerNum + 1];

        StringTokenizer st;
        for (int i = 0; i < computerPairNum; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            graph[first][second] = true;
            graph[second][first] = true;
        }

        bfs(1);

    }

    private static void bfs(int num) {
        Queue<Integer> queue = new LinkedList<>();

        isVisit[num] = true;
        queue.offer(num);

        int cnt = 0;
        while (!queue.isEmpty()) {
            int xPoint = queue.poll();

            for (int i = 1; i < graph.length; i++) {
                if (graph[xPoint][i] && !isVisit[i]) {
                    queue.offer(i);
                    isVisit[i] = true;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

}

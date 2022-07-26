package boj.깊이우선탐색_너비우선탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 바이러스_재풀이 {

    static boolean[][] graph;
    static boolean[] isVisit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computerNum = Integer.parseInt(br.readLine());
        int computerPairNum = Integer.parseInt(br.readLine());
        graph = new boolean[computerNum + 1][computerNum + 1];
        isVisit = new boolean[computerNum + 1];

        StringTokenizer st;

        for (int i = 0; i < computerPairNum; i++) {//그래프작성 시작
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            graph[first][second] = true;
            graph[second][first] = true;
        }//그래프작성 끝

        bfs(1);
    }

    public static void bfs(int computerNum) {
        Queue<Integer> queue = new LinkedList<>();//큐 생성

        isVisit[computerNum] = true;//컴퓨터 번호에 방문 기록
        queue.add(computerNum);// 큐에 시작점 1 넣음

        int count = 0;

        while (!queue.isEmpty()) {//큐가 빌때까지 반복
            int num = queue.poll();//큐 헤드에서 가져오기
            for (int i = 1; i < graph.length; i++) {//그래프 크기만큼 반복
                if (graph[num][i] && !isVisit[i]) {//반복수는 1
                    //큐에 추가하는 조건은, 컴퓨터끼리 이어져있고, 방문을 안한 숫자
                    queue.add(i);
                    isVisit[i] = true;
                    count++;
                }
            }

        }
        System.out.println(count);
    }

}

package boj.트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No_11725 {

    static List<List<Integer>> GRAPH;
    static boolean[] isVisit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer tokens;

        GRAPH = new ArrayList<>(N);
        for (int i = 0; i <= N; i++) {
            GRAPH.add(new ArrayList<>());
        }
        isVisit = new boolean[N + 1];

        //트리를 연결
        for (int i = 0; i < N - 1; i++) {
            tokens = new StringTokenizer(br.readLine());
            int pointOne = Integer.parseInt(tokens.nextToken());
            int pointTwo = Integer.parseInt(tokens.nextToken());
            GRAPH.get(pointOne).add(pointTwo);
            GRAPH.get(pointTwo).add(pointOne);
        }

        //트리 순회
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        isVisit[1] = true;

        int[] parentNum = new int[N + 1];

        while (!queue.isEmpty()) {

            int nextNum = queue.poll();

            List<Integer> connectedNums = GRAPH.get(nextNum);
            for (int num : connectedNums) {
                if (!isVisit[num]) {
                    parentNum[num] = nextNum;
                    isVisit[nextNum] = true;
                    queue.add(num);
                }
            }

        }

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < parentNum.length; i++) {
            sb.append(parentNum[i] + "\n");
        }
        System.out.println(sb);



    }
}

package boj.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스타트와_링크 {

    static int N;
    static int[][] numbers;
    static boolean[] isVisit;
    static int min_value = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        numbers = new int[N][N];
        isVisit = new boolean[N];


        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < N; j++) {
                numbers[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        combination(0, 0);
        System.out.println(min_value);

    }

    static void combination(int idx, int count) {
        if(count == N / 2) {
            findDif();
            return;
        }

        for(int i = idx; i < N; i++) {
            if(!isVisit[i]) {
                isVisit[i] = true;
                combination(i + 1, count + 1);
                isVisit[i] = false;
            }
        }
    }

    static void findDif() {
        int team_start = 0;
        int team_link = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (isVisit[i] == true && isVisit[j] == true) {
                    team_start += numbers[i][j];
                    team_start += numbers[j][i];
                } else if (isVisit[i] == false && isVisit[j] == false) {
                    team_link += numbers[i][j];
                    team_link += numbers[j][i];
                }
            }
        }
        int val = Math.abs(team_start - team_link);

        if (val == 0) {
            System.out.println(val);
            System.exit(0);
        }

        min_value = Math.min(val, min_value);

    }

}

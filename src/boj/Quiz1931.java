package boj;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Quiz1931 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] allMeets = new int[N][2];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            allMeets[i][0] = Integer.parseInt(st.nextToken());
            allMeets[i][1] = Integer.parseInt(st.nextToken());
        }

        br.close();

        Arrays.sort(allMeets, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        int count = 0;
        int prevMeetTime = 0;

        for (int i = 0; i < N; i++) {

            if (prevMeetTime <= allMeets[i][0]) {
                prevMeetTime = allMeets[i][1];
                count++;
            }

        }

        System.out.println(count);

    }

}

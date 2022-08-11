package boj.분할정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이_만들기 {

    static boolean[][] paper;
    static int bluePaperCount = 0;
    static int whitePaperCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        paper = new boolean[N][N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            st = new StringTokenizer(input);

            int cnt = 0;
            while (st.hasMoreTokens()) {
                if (Integer.parseInt(st.nextToken()) == 1) {
                    paper[i][cnt] = true;
                }
                cnt++;
            }
            cnt = 0;
        }

        divideConquer(0, 0, N);

        System.out.println(whitePaperCount);
        System.out.println(bluePaperCount);
    }

    static void divideConquer(int startX, int startY, int length) {
        if (length == 1) {
            if (paper[startX][startY]) {
                bluePaperCount++;
            } else {
                whitePaperCount++;
            }
            return;
        }

        int whiteCount = 0;
        int blueCount = 0;
        int fullArea = (int) Math.pow(length, 2);
        int halfLength = length / 2;
        for (int i = startX; i < startX + length; i++) {
            for (int j = startY; j < startY + length; j++) {
                if (paper[i][j]) {
                    blueCount++;
                } else {
                    whiteCount++;
                }
            }
        }

        if (blueCount == fullArea) {
            bluePaperCount++;
            return;
        }

        if (whiteCount == fullArea) {
            whitePaperCount++;
            return;
        }

        divideConquer(startX, startY, halfLength);
        divideConquer(startX, startY + halfLength, halfLength);
        divideConquer(startX + halfLength, startY, halfLength);
        divideConquer(startX + halfLength, startY + halfLength, halfLength);

    }


}

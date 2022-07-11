package boj.구현;

import java.io.*;
import java.util.StringTokenizer;

public class 단어_뒤집기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            while (st.hasMoreTokens()) {
                sb = new StringBuilder();
                sb.append(" " + st.nextToken());
                sb.reverse();
                bw.append(sb);
            }
            bw.append("\n");
        }
        bw.flush();
    }

}

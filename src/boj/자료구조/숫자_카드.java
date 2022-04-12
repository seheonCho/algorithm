package boj.자료구조;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 숫자_카드 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Set<Integer> numSet = new HashSet<>();

        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            numSet.add(num);
        }

        br.readLine();
        StringTokenizer secondSt = new StringTokenizer(br.readLine(), " ");

        while (secondSt.hasMoreTokens()) {
            int num = Integer.parseInt(secondSt.nextToken());

            if (numSet.contains(num)) {
                sb.append(1 + " ");
                continue;
            }
            sb.append(0 + " ");

        }

        bw.append(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}

package boj.자료구조;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 수_찾기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<Integer> numSet = new HashSet<>();

        int firstN = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < firstN; i++) {
            numSet.add(Integer.valueOf(st.nextToken()));
        }

        int secondN = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < secondN; i++) {

            int num = Integer.parseInt(st.nextToken());

            if (numSet.contains(num)) {
                bw.append( "1" + '\n');
            } else {
                bw.append("0" + '\n');
            }

        }

        bw.flush();
    }

}

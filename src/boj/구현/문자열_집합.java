package boj.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 문자열_집합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> checkWords = new HashSet<>();

        for (int i = 0; i < N; i++) checkWords.add(br.readLine());

        int checkCount = 0;
        for (int i = 0; i < M; i++) {
            if (checkWords.contains(br.readLine())) checkCount++;
        }
        System.out.println(checkCount);
    }

}

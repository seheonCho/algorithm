package boj.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팩토리얼_0의_개수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int countToZero = 0;

        while (N >= 5) {
            countToZero += N / 5;
            N /= 5;
        }
        
        System.out.println(countToZero);
    }

}

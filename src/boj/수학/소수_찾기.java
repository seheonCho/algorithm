package boj.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수_찾기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] numArr = new int[input];
        for (int i = 0; i < input; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for(int numStr : numArr) {
            if(isPrime(numStr)) cnt++;
        }
        System.out.println(cnt);

    }

    public static boolean isPrime(int num) {

        if (num == 1) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;

        }
        return true;
    }

}

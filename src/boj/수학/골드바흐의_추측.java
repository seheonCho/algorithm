package boj.수학;

import java.util.Scanner;

public class 골드바흐의_추측 {

    public static void main(String[] args) {

        Scanner aScanner = new Scanner(System.in);

        int N = 10000;

        boolean check[] = new boolean[N+1];
        for (int i = 2; i <= N; i++) {
            check[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            for (int j = i+i; j <= N; j += i) {
                check[j] = false;
            }
        }

        int T = aScanner.nextInt();
        for (int i = 0; i < T; i++) {
            int n = aScanner.nextInt();
            int tmp = n / 2;

            for (int j = tmp; j >= 2; j--) {
                if(check[j] && check[n - j]) {
                    System.out.println(j + " " + (n - j));
                    break;
                }
            }
        }
    }

}

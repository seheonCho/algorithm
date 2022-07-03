package boj.수학;

import java.util.Scanner;

public class 약수의_합_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i * (N / i);
        }

        System.out.println(sum);

    }

}

package boj.다이나믹프로그래밍;

import java.util.Scanner;

public class 알고리즘_수업_피보나치_수_1 {

    static int[] memo;
    static int fibDpCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        memo = new int[N + 1];

        int fibCount = fib(N);
        fibDP(N);
        System.out.println(fibCount + " " + fibDpCount);

    }

    static int fib (int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return (fib(n - 1) + fib(n - 2));
    }

    static int fibDP (int n) {
        memo[1] = 1;
        memo[2] = 1;

        for (int i = 3; i <= n; i++) {
            int beforeTwo = memo[i - 2];
            int beforeOne = memo[i - 1];
            memo[i] = beforeOne + beforeTwo;
            fibDpCount++;
        }
        return memo[n];
    }


}

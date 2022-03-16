package boj.수학;

import java.util.Scanner;

public class 피보나치_수_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(fibonacci(N));
    }

    private static int fibonacci(int number) {
        if (number == 0) return 0;
        if (number == 1) return 1;

        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}

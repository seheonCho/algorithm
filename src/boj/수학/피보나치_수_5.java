package boj.수학;

import java.util.Scanner;

public class 피보나치_수_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(fibonacci(N));
    }

    private static int fibonacci(int number) {
        if (number < 2) {
            return number;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}

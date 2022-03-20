package boj.수학;

import java.util.Scanner;

// 시간복잡도를 생각해, 유클리드 호제법을 공부하고 풀어보기.
public class 최대공약수와_최소공배수 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();


        int gcd = gcd(firstInput, secondInput);
        int lcm = lcmFromGcd(firstInput, secondInput, gcd);

        System.out.println(gcd);
        System.out.println(lcm);
    }

    private static int lcmFromGcd(int a, int b, int gcd) {
        return a * b / gcd;
    }

    // 최대공약수, 유클리즈 호제법
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }



}

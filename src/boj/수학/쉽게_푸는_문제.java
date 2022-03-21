package boj.수학;

import java.util.Scanner;

public class 쉽게_푸는_문제 {

    static int start_boundary;
    static int end_boundary;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        start_boundary = scanner.nextInt();
        end_boundary = scanner.nextInt();
        int sum = 0;
        int addNum = 1;
        int cnt = 0;

        for (int i = 1; i < 1000; i++) {

            for (int j = 1; j <= addNum; j++) {

                if (isInboundary(cnt)) {
                    sum += addNum;
                }

                cnt++;

            }

            addNum++;

        }
        System.out.println(sum);
    }

    private static boolean isInboundary(int index) {

        if (index >= start_boundary - 1 && index <= end_boundary - 1) {
            return true;
        }
        return false;

    }

}

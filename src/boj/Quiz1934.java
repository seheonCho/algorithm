package boj;

import java.util.Scanner;

public class Quiz1934 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int cnt = scanner.nextInt();
        char changeLine = '\n';

        for (int i=0; i<cnt; i++) {
            int numA = scanner.nextInt();
            int numB = scanner.nextInt();

            int minimizeMeasureNum = minimizeMeasureNum(numA, numB);
            sb.append(numA * numB / minimizeMeasureNum).append(changeLine);
        }

        System.out.println(sb);

    }

    private static int minimizeMeasureNum(int a, int b) {

        while (b != 0) {

            int other = a % b;
            a = b;
            b = other;

        }

        return a;
    }
}

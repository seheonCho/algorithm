package boj;

import java.util.Scanner;

public class Quiz15650 {

    static int numberN, numberM;
    static int[] result;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        numberN = scanner.nextInt();
        numberM = scanner.nextInt();

        result = new int[numberM];

        dfs(1, 0);

    }

    public static void dfs(int min, int depth) {

        if (depth == numberM) {
            for (int val : result) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = min; i <= numberN; i++) {

            result[depth] = i;
            dfs(i + 1, depth + 1);

        }
    }

}
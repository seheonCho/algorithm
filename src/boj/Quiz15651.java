package boj;

import java.util.Scanner;

public class Quiz15651 {

    public static int[] results;
    public static int numberX, numberY;
    public static StringBuilder sb;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        numberX = scanner.nextInt();
        numberY = scanner.nextInt();

        results = new int[numberY];
        sb = new StringBuilder();

        dfs(0);

        //최종출력
        System.out.print(sb);
    }

    public static void dfs(int depth) {
        // depth와 numberY 같아지면 출력후 return
        if (depth == numberY) {

            for (int i = 0; i < numberY; i++) {
                sb.append(results[i] + " ");
            }

            sb.append("\n");
            return;

        }

        for (int i = 1; i <= numberX; i++) {
            results[depth] = i;
            dfs(depth + 1);
        }
    }


}

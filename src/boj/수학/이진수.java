package boj.수학;

import java.util.Scanner;

public class 이진수 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {

            int n = scanner.nextInt();
            String numStr = Integer.toBinaryString(n);
            StringBuilder sb = new StringBuilder(numStr);
            sb.reverse();
            numStr = sb.toString();

            for (int j = 0; j < numStr.length(); j++) {
                char idxChar = numStr.charAt(j);

                if (idxChar == '1') {
                    System.out.print(j + " ");
                }
            }

            System.out.println();

        }

    }

}

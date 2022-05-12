package boj.수학;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 소인수분해 {

    public static void main(String[] args) throws IOException {
        Scanner aScanner = new Scanner(System.in);
        int N = aScanner.nextInt();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 2; i <= Math.sqrt(N); i++) {
            while (N % i == 0) {
                bw.append(i + "\n");
                N /= i;
            }
        }

        if (N != 1) bw.append(N + "\n");
        bw.flush();

    }

}

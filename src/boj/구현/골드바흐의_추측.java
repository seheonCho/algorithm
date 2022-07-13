package boj.구현;

import java.io.*;

public class 골드바흐의_추측 {

    static boolean[] isPrimeNums = new boolean[100001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) break;
            if (isPrime(input)) {
                isPrimeNums[input] = true;
            }

            for (int i = 2; i < input; i++) {
                if (isOddNum(i) && isPrime(i) && isPrime(input - i)) {
                    bw.append(input + " = " + i + " + " + (input - i)+"\n");
                    break;
                }
            }

        }
        bw.flush();

    }

    private static boolean isPrime(int num) {
        int sqrtNum = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrtNum; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isOddNum(int num) {
        if (num % 2 == 0) {
            return false;
        }
        return true;
    }

}

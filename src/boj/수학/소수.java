package boj.수학;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class 소수 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int startBoundary = Integer.parseInt(br.readLine());
        int endBoundary = Integer.parseInt(br.readLine());

        List<Integer> primeNums = new LinkedList<>();
        int sum = 0;

        for (int i = startBoundary; i <= endBoundary; i++) {

            if (isPrime(i)) {

                if (i == 1) continue;

                primeNums.add(i);
                sum += i;
            }

        }

        if (primeNums.size() == 0) {
            System.out.println("-1");
        } else {
            primeNums.sort((a, b) -> a - b);
            System.out.println(sum);
            System.out.println(primeNums.get(0));
        }
        br.close();

    }

    private static boolean isPrime(int num) {
        int sqrtNum = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrtNum; i++) {
            if (num == 1 || num % i == 0) {
                return false;
            }
        }
        return true;
    }

}

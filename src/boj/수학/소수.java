package boj.수학;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class 소수 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int startBoundary = Integer.parseInt(br.readLine());
        int endBoundary = Integer.parseInt(br.readLine());

        List<Integer> primeNums = new LinkedList<>();
        int sum = 0;

        for (int i = startBoundary; i <= endBoundary; i++) {
            if (isPrime(i)) {
                primeNums.add(i);
                sum += i;
            }
        }

        if (primeNums.size() == 0) {
            bw.append("-1");
        } else {
            primeNums.sort((a, b) -> a - b);
            System.out.println(primeNums.get(0));
            bw.append(sum + "\n");
        }
        bw.flush();
        bw.close();
        br.close();


    }

    private static boolean isPrime(int num) {
        int sqrtNum = (int)Math.sqrt(num);
        for (int i = 2; i <= sqrtNum; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}

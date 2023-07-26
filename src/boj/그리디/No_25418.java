package boj.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_25418 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int count = 0;
        while (a != k) {
            count++;
            if (k % 2 == 0 && k / 2 >= a) {
                k /= 2;
            } else {
                k--;
            }
        }

        System.out.println(count);
    }

}

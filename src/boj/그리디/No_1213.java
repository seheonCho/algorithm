package boj.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1213 {

    public static void main(String[] args) throws IOException {
        // 영어 대문자 50개
        // 동일한 문자가 홀수인게 두개 이상이면 불가능
        //불가능시 "I'm Sorry Hansoo" 출력
        //가능하면 문자열 정렬해서 사전순 제일 앞
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] digitCounts = new int[26];
        for (int i = 0; i < input.length(); i++) {
            int index = input.charAt(i) - 'A';
            digitCounts[index]++;
        }

        int oddCount = 0;
        int num = 0;
        for (int i = 0; i < digitCounts.length; i++) {
            if (digitCounts[i] % 2 != 0) {
                oddCount++;
                num = i;
            }

            if (oddCount >= 2) {
                System.out.println("I'm Sorry Hansoo");
                return;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digitCounts.length; i++) {
            for (int j = 0; j < digitCounts[i] / 2; j++) {
                sb.append((char) (i + 'A'));
            }
        }

        String result = sb.toString();
        if (oddCount == 1) {
            result += (char) (num + 'A');
        }

        result += sb.reverse().toString();
        System.out.println(result);

    }

}

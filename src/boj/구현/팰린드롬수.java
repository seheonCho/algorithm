package boj.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팰린드롬수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = br.readLine();
            if (input.equals("0")) break;

            if (isPalindrome(input)) {
                sb.append("yes" + "\n");
            } else {
                sb.append("no" + "\n");
            }

        }
        System.out.println(sb);


    }

    private static boolean isPalindrome(String word) {
        char[] splitWord = word.toCharArray();
        int wordLen = splitWord.length;
        int middleIdx = (wordLen / 2) + (wordLen % 2) - 1;
        // word 121 / wordLen 3 / middleIdx = 1
        for (int i = 0; i <= middleIdx; i++) {
            if (splitWord[i] != splitWord[wordLen - 1 - i]) {
                return false;
            }
        }
        return true;

    }


}

package boj.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1120 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        String a = inputs[0];
        String b = inputs[1];
        int ans = a.length();

        for (int i = 0; i <= b.length() - a.length(); i++) {
            int cnt = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) != b.charAt(i + j)) {
                    cnt++;
                }
            }

            ans = Math.min(cnt, ans);
        }

        System.out.println(ans);
    }

}

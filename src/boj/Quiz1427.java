package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz1427 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("");
        String box = "";

        for (int i=0; i<input.length; i++) {

            for (int j=i+1; j<input.length; j++) {

                if (toStr(input[i]) < toStr(input[j])) {
                    box = input[i];
                    input[i] = input[j];
                    input[j] = box;
                }

            }

        }

        for (String str : input) {
            System.out.print(str);
        }

    }

    static int toStr(String str) {
        return Integer.parseInt(str);
    }

}

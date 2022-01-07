package boj;

import java.io.*;
import java.util.Scanner;

public class Quiz1929 {

    public static boolean[] sosus;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int numberM = scanner.nextInt();
        int numberN = scanner.nextInt();

        StringBuilder sb = new StringBuilder();
        char space = '\n';

        sosus = new boolean[numberN + 1];

        setSosu();

        for (int i = numberM; i <= numberN; i++) {
            if(!sosus[i]) sb.append(i).append(space);
        }
        System.out.println(sb);
    }

    static void setSosu() {

        sosus[0] = sosus[1] = true;

        for(int i = 2; i <= Math.sqrt(sosus.length); i++) {
            if(sosus[i]) continue;
            for(int j = i * i; j < sosus.length; j += i) {
                sosus[j] = true;
            }
        }

    }

}

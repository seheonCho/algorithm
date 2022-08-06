package boj.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 무한_문자열 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int sLen = S.length();
        String copyS = S;

        String T = br.readLine();
        int tLen = T.length();
        String copyT = T;

        if (sLen != tLen) {
            int standardLen = leastCommonMultiple(sLen, tLen);
            while (copyS.length() != standardLen) copyS += S;
            while (copyT.length() != standardLen) copyT += T;
        }

        if (copyS.equals(copyT))
            System.out.println(1);
        else
            System.out.println(0);

    }

    private static int leastCommonMultiple(int sLen, int tLen) {
        return (sLen * tLen) / greatestCommonDivisor(sLen, tLen);
    }

    private static int greatestCommonDivisor(int sLen, int tLen) {
        int temp = -1;
        while (tLen > 0) {
            temp = sLen % tLen;
            sLen = tLen;
            tLen = temp;
        }
        return sLen;
    }


}

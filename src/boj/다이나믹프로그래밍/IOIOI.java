package boj.다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOIOI {

    private static final String OI = "OI";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ioiCnt = Integer.parseInt(br.readLine());
        int allLength = Integer.parseInt(br.readLine());

        StringBuilder pnStr = new StringBuilder("I");
        for (int i = 0; i < ioiCnt; i++) {
            pnStr.append(OI);
        }
        int pnLen = pnStr.length();
        System.out.println("pnStr = " + pnStr);

        StringBuilder allStr = new StringBuilder(br.readLine());

        int cnt = 0;
        while (allStr.toString().contains(pnStr)) {
            int pnIdx = allStr.indexOf(pnStr.toString());
            allStr = allStr.delete(pnIdx, pnIdx + 2);
            cnt++;
        }

        System.out.println(cnt);
    }

}

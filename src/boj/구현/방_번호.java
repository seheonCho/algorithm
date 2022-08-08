package boj.구현;

import java.util.Scanner;

public class 방_번호 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int nLen = N.length();
        int[] arr = new int[10];

        for (int i = 0; i < nLen; i++) {
            int nowArrVal = Character.getNumericValue(N.charAt(i));

            if (nowArrVal == 6) {
                arr[9]++;
            } else {
                arr[nowArrVal]++;
            }

        }

        int maxIdx = 0;
        for (int i = 0; i < 9; i++) {
            maxIdx = Math.max(maxIdx, arr[i]);
        }

        int nineNum = arr[9] / 2;
        if (arr[9] % 2 == 1) {
            nineNum++;
        }

        maxIdx = Math.max(maxIdx, nineNum);
        System.out.println(maxIdx);
    }

}

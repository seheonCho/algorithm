package boj.투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 배열_합치기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] sizes = br.readLine().split(" ");
        int aSize = Integer.parseInt(sizes[0]);
        int bSize = Integer.parseInt(sizes[1]);

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] aArr = new int[aSize];

        int idx = -1;
        while (st.hasMoreTokens()) {
            aArr[++idx] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        int[] bArr = new int[bSize];

        idx = -1;
        while (st.hasMoreTokens()) {
            bArr[++idx] = Integer.parseInt(st.nextToken());
        }

        int[] newArr = new int[aSize + bSize];
        int pointer = 0;

        for (int num : aArr) {
            newArr[pointer] = num;
            pointer++;
        }

        for (int num : bArr) {
            newArr[pointer] = num;
            pointer++;
        }

        Arrays.sort(newArr);

        StringBuilder sb = new StringBuilder();

        for (int num : newArr) sb.append(num + " ");

        System.out.println(sb);

    }

}

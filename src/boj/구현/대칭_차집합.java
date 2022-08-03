package boj.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 대칭_차집합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int aNum = Integer.parseInt(st.nextToken());
        int bNum = Integer.parseInt(st.nextToken());

        Set<Integer> aSet = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aNum; i++) {
            aSet.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> bSet = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bNum; i++) {
            bSet.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;

        for (int num : aSet) {
            if (!bSet.contains(num)) count++;
        }

        for (int num : bSet) {
            if (!aSet.contains(num)) count++;
        }

        System.out.println(count);

    }

}

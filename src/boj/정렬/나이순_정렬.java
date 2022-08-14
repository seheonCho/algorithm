package boj.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 나이순_정렬 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String[][] joinUsers = new String[N][2];
        Map<String, Integer> joinSeq = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String age = st.nextToken();
            String name = st.nextToken();
            joinUsers[i][0] = age;
            joinUsers[i][1] = name;
            joinSeq.put(name, i);
        }

        Arrays.sort(joinUsers, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return joinSeq.get(o1[1]) - joinSeq.get(o2[1]);
            }
            return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
        });

        StringBuilder sb = new StringBuilder();
        for (String[] user : joinUsers) {
            sb.append(user[0] + " " + user[1] + "\n");
        }

        System.out.println(sb);
    }

}

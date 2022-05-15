package boj.정렬;

import java.io.*;
import java.util.*;

public class 듣보잡 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String tmp = br.readLine();
            if(set.contains(tmp)){
                result.add(tmp);
            }
        }

        Collections.sort(result);

        bw.append(result.size() + "\n");
        for (String s : result) {
            bw.append(s + "\n");
        }
        bw.flush();
    }

}


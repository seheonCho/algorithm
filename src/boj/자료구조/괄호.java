package boj.자료구조;

import java.io.*;
import java.util.Stack;

public class 괄호 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stacks;

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            char[] chars = str.toCharArray();
            stacks = new Stack<>();

            for (int j = 0; j < str.length(); j++) {
                char nowChar = chars[j];

                if (nowChar == '(') {
                    stacks.push(nowChar);
                } else {
                    if (stacks.isEmpty()){
                        stacks.push(nowChar);
                        break;
                    } else {
                        stacks.pop();
                    }
                }
            }
            if (stacks.empty()) {
                bw.append("YES" + '\n');
            } else {
                bw.append("NO" + '\n');
            }

        }
        bw.flush();
    }

}

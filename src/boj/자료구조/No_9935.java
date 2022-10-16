package boj.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No_9935 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String expStr = br.readLine();

        int strLen = str.length();
        int expLen = expStr.length();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < strLen; i++) {
            stack.push(str.charAt(i));

            if (stack.size() >= expLen) {
                boolean cleanFlag = true;

                for (int j = 0; j < expLen; j++) {
                    if (stack.get(stack.size() - expLen + j) != expStr.charAt(j)) {
                        cleanFlag = false;
                        break;
                    }
                }

                if (cleanFlag) {
                    for (int j = 0; j < expLen; j++) {
                        stack.pop();
                    }
                }

            }

        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        if (sb.length() == 0) {
            System.out.println("FRULA");
        } else {
            System.out.println(sb.reverse());
        }

    }

}

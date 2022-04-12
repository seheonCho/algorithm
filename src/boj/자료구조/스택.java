package boj.자료구조;

import java.io.*;
import java.util.Stack;

public class 스택 {

    static Stack<Integer> numStack = new Stack<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            String sortation = input.substring(0, 2);

            if ("pu".equals(sortation)) {
                int num = Integer.parseInt(input.split(" ")[1]);
                push(num);
                continue;
            }

            if ("po".equals(sortation)) {
                pop();
            } else if ("si".equals(sortation)) {
                size();
            } else if ("em".equals(sortation)) {
                empty();
            } else {
                top();
            }

            sb.append("\n");

        }

        bw.append(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    private static boolean isZeroSize() {
        if (numStack.size() == 0) {
            return true;
        }
        return false;
    }

    private static void push(int num) {
        numStack.push(num);
    }

    private static void pop() {
        if (isZeroSize()) {
            sb.append("-1");
        } else {
            sb.append(numStack.pop());
        }
    }

    private static void size() {
        sb.append(numStack.size());
    }

    private static void empty() {
        if (numStack.isEmpty()) {
            sb.append(1);
        } else {
            sb.append(0);
        }
    }

    private static void top() {
        if (numStack.isEmpty()) {
            sb.append(-1);
        } else {
            sb.append(numStack.peek());
        }
    }

}

package boj.자료구조;

import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

public class 큐 {

    static Queue<Integer> queue;
    static StringBuilder sb = new StringBuilder();
    static int back = -1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            String sortation = input.substring(0, 2);

            if ("pu".equals(sortation)) {
                int num = Integer.parseInt(input.split(" ")[1]);
                back = num;
                push(num);
                continue;
            }

            if ("po".equals(sortation)) {
                pop();
            } else if ("si".equals(sortation)) {
                size();
            } else if ("em".equals(sortation)) {
                empty();
            } else if ("fr".equals(sortation)) {
                front();
            } else {
                back();
            }

            sb.append("\n");

        }

        bw.append(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    private static void push(int num) {
        queue.add(num);
    }

    private static void pop() {
        if (queue.isEmpty()) {
            sb.append(-1);
        } else {
            sb.append(queue.remove());
        }
    }

    private static void size() {
        sb.append(queue.size());
    }

    private static void empty() {
        if (queue.isEmpty()) {
            sb.append(1);
        } else {
            sb.append(0);
        }
    }

    private static void front() {
        if (queue.isEmpty()) {
            sb.append(-1);
        } else {
            sb.append(queue.peek());
        }
    }

    private static void back() {
        if (queue.isEmpty()) {
            sb.append(-1);
        } else {
            sb.append(back);
        }
    }

}

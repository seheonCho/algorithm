package boj.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class AC {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            String[] functions = br.readLine().split(" ");
            for (int j = 0; j < functions.length; j++) {

                int n = Integer.parseInt(br.readLine());

                String arrStr = br.readLine();
                Deque<Integer> deque = new ArrayDeque<>();
                for (String s : arrStr.substring(1, arrStr.length() - 1).split(",")) {
                    if (!s.equals("")) {
                        deque.add(Integer.valueOf(s));
                    }
                }
                System.out.println(operation(deque, functions[j]));
            }
        }
    }

    private static String operation(Deque<Integer> deque, String commands) {
        boolean reverse = false;

        for (char command : commands.toCharArray()) {
            if (command == 'R')
                reverse = !reverse;
            else {
                if (deque.size() == 0)
                    return "error";

                if (reverse)
                    deque.removeLast();
                else
                    deque.removeFirst();
            }
        }

        StringBuilder sb = new StringBuilder("[");
        while (!deque.isEmpty()) {

            sb.append(reverse ? deque.removeLast() : deque.removeFirst());

            if (deque.size() != 0)
                sb.append(',');
        }
        sb.append(']');

        return sb.toString();
    }

}

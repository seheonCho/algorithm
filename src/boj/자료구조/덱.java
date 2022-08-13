package boj.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class 덱 {

    private static final String PUSH_FRONT = "push_front";
    private static final String PUSH_BACK = "push_back";
    private static final String POP_FRONT = "pop_front";
    private static final String POP_BACK = "pop_back";
    private static final String SIZE = "size";
    private static final String EMPTY = "empty";
    private static final String FRONT = "front";
    private static final String BACK = "back";
    private static final Deque<Integer> deque = new ArrayDeque<>();
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            process(new StringTokenizer(br.readLine()));
        }

        System.out.println(sb);
    }

    private static void process(StringTokenizer st) {

        switch (st.nextToken()) {
            case PUSH_FRONT:
                int pushFrontNum = Integer.parseInt(st.nextToken());
                deque.addLast(pushFrontNum);
                break;
            case PUSH_BACK:
                int pushBackNum = Integer.parseInt(st.nextToken());
                deque.addFirst(pushBackNum);
                break;
            case POP_FRONT:
                if (deque.isEmpty()) {
                    sb.append(-1 + "\n");
                    break;
                }
                sb.append(deque.pollLast() + "\n");
                break;
            case POP_BACK:
                if (deque.isEmpty()) {
                    sb.append(-1 + "\n");
                    break;
                }
                sb.append(deque.pollFirst() + "\n");
                break;
            case SIZE:
                sb.append(deque.size() + "\n");
                break;
            case EMPTY:
                if (deque.isEmpty()) {
                    sb.append(1 + "\n");
                    break;
                }
                sb.append(0 + "\n");
                break;
            case FRONT:
                if (deque.isEmpty()) {
                    sb.append(-1 + "\n");
                    break;
                }
                sb.append(deque.peekLast() + "\n");
                break;
            case BACK:
                if (deque.isEmpty()) {
                    sb.append(-1 + "\n");
                    break;
                }
                sb.append(deque.peekFirst() + "\n");
                break;

        }
    }

}

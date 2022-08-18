package boj.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 직각삼각형 {

    static final String RIGHT_WORD = "right";
    static final String WRONG_WORD = "wrong";
    static final String ZERO = "0";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] sides = new int[3];
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            String tokenOne = st.nextToken();
            String tokenTwo = st.nextToken();
            String tokenThree = st.nextToken();

            if (tokenOne.equals(ZERO) &&
                tokenTwo.equals(ZERO) &&
                tokenThree.equals(ZERO)) {
                break;
            }

            sides[0] = Integer.parseInt(tokenOne);
            sides[1] = Integer.parseInt(tokenTwo);
            sides[2] = Integer.parseInt(tokenThree);

            Arrays.sort(sides);
            int shortSide = (int) Math.pow(sides[0], 2);
            int middleSide = (int) Math.pow(sides[1], 2);
            int longSide = (int) Math.pow(sides[2], 2);

            if (shortSide + middleSide == longSide)
                sb.append(RIGHT_WORD + '\n');
            else
                sb.append(WRONG_WORD + '\n');

        }

        System.out.println(sb);
    }

}

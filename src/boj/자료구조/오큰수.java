package boj.자료구조;

import java.io.*;
import java.util.Arrays;

public class 오큰수 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int theNumbers = Integer.parseInt(br.readLine());
        String[] numbersStr = new String[theNumbers];

        int[] outputNumbers = new int[theNumbers];

        numbersStr = br.readLine().split(" ");
        br.close();
        int[] numbersInt = Arrays.stream(numbersStr).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < theNumbers - 1; i++) {

            for (int j = i + 1; j < theNumbers; j++) {

                if (numbersInt[i] < numbersInt[j]) {
                    outputNumbers[i] = numbersInt[j];
                    break;
                    //break 로 나가야 한다, 최초 발견한 큰 수 중 가장 좌측이라서.
                }

                if (j == theNumbers-1 && outputNumbers[i] == 0) {
                    outputNumbers[i] = -1;
                }

            }

        }

        outputNumbers[theNumbers-1] = -1;
        for (int num : outputNumbers) bw.append(num + " ");
        bw.flush();
        bw.close();


    }

}

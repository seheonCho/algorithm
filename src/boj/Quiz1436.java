package boj;

import java.io.IOException;
import java.util.Scanner;

public class Quiz1436 {

    public static void main(String[] args) throws IOException {

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
//        int input = Integer.parseInt(bufferedReader.readLine());
        int input = sc.nextInt();
//        bufferedReader.close();

        int cnt = 0;
        int num = 666;
        String numStr = "666";

        while (cnt < input) {
            if (String.valueOf(num).contains(numStr)) {
                cnt++;
            }
            num += 1;
        }
        System.out.println(num - 1);
//        bufferedWriter.write(num - 1);
//        bufferedWriter.flush();
//        bufferedWriter.close();

    }


    /**
     *
     * 1 666
     * 2 1666
     * 3 2666
     * 4 3666
     * 5 4666
     * 6 5666
     * 7 6660
     * 8 6661
     *
     * */

}

package boj.브루트포스;

import java.io.IOException;
import java.util.Scanner;

public class 영화감독_숌 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

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

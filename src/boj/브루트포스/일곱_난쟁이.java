package boj.브루트포스;

import java.util.Arrays;
import java.util.Scanner;

public class 일곱_난쟁이 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int DWARF_NUMBERS = 9;
        int[] dwarfs = new int[9];
        int targetSum = 100;
        int allSum = 0;

        for (int i = 0; i < DWARF_NUMBERS; i++) {
            dwarfs[i] = Integer.parseInt(scanner.nextLine());
            allSum += dwarfs[i];
        }

        Arrays.sort(dwarfs);

        outLoop: for (int i = 0; i < DWARF_NUMBERS; i++) {

            for (int j = 0; j < DWARF_NUMBERS; j++) {

                if (allSum - dwarfs[i] - dwarfs[j] == targetSum) {
                    for (int dwarf : dwarfs) {
                        if (dwarf != dwarfs[i] && dwarf != dwarfs[j]) {
                            System.out.println(dwarf);
                        }
                    }
                    break outLoop;
                }

            }

        }

    }

}

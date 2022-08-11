package boj.브루트포스;

import java.util.Scanner;

public class 분해합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();

        int targetNum = Integer.parseInt(N);

        int constructorNum = 0;
        int sum = 0;
        for (int i = 0; i < targetNum; i++) {

            String strNum = String.valueOf(i);
            sum += i;
            for (int j = 0; j < strNum.length(); j++) {
                sum += Character.getNumericValue(strNum.charAt(j));
            }

            if (sum == targetNum) {
                constructorNum = i;
                break;
            }
            sum = 0;
        }

        if (constructorNum != 0) {
            System.out.println(constructorNum);
        } else {
            System.out.println(0);
        }
    }

}

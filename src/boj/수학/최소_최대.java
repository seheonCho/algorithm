package boj.수학;

import java.util.Scanner;

public class 최소_최대 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] numArr = scanner.nextLine().split(" ");
        int maxNum = -1000000;
        int minNum = 1000000;

        for(String nums : numArr) {
            int parseNum = Integer.parseInt(nums);
            if(maxNum < parseNum) {
                maxNum = parseNum;
            }
            if(minNum > parseNum) {
                minNum = parseNum;
            }

        }
        System.out.println(minNum + " " + maxNum);

    }

}
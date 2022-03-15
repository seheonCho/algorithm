package boj.수학;

import java.util.Arrays;
import java.util.Scanner;

public class 지능형_기차_2 {

    final static int STATION_NUMBER = 10;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] peopleCurrents = new int[STATION_NUMBER];
        int nowPeopleNum = 0;

        for (int i = 0; i < STATION_NUMBER; i++) {
            String[] trainCurrents = scanner.nextLine().split(" ");
            int outPeopleNum = Integer.parseInt(trainCurrents[0]);
            int inPeopleNum = Integer.parseInt(trainCurrents[1]);
            nowPeopleNum += inPeopleNum - outPeopleNum;
            peopleCurrents[i] += nowPeopleNum;
        }

        Arrays.sort(peopleCurrents);

        System.out.println(peopleCurrents[STATION_NUMBER - 1]);

    }

}

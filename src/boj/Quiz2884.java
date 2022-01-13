package boj;

import java.util.Scanner;

public class Quiz2884 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte A = scanner.nextByte();
        byte B = scanner.nextByte();
        char maxHour = 24;
        char maxMinute = 60;
        if(B<45) {
            if(A<1) {
                A = (byte) (maxHour - 1);
                B = (byte) (B - 45 + maxMinute);
            } else {
                A = (byte) (A - 1);
                B = (byte) (B - 45 + maxMinute);
            }
        } else {
            B = (byte) (B - 45);
        }
        System.out.println(A + " " + B);
    }

}

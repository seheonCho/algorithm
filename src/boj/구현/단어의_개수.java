package boj.구현;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 단어의_개수 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scanner.nextLine(), " ");
        System.out.println(st.countTokens());
    }

}

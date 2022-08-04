package boj.구현;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 서로_다른_부분_문자열의_개수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        Set<String> words = new HashSet<>();

        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j <= S.length(); j++) {
                words.add(S.substring(i, j));
            }
        }

        words.remove("");
        System.out.println(words.size());

    }

}

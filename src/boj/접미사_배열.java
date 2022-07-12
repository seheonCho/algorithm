package boj;

import java.util.*;

public class 접미사_배열 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String S = sc.nextLine();
        List<String> strings = new LinkedList<>();

        for (int i = 0; i < S.length(); i++) {
            String word = S.substring(i);
            strings.add(word);
        }

        Collections.sort(strings);
        for (String test : strings) {
            sb.append(test + "\n");
        }
        System.out.println(sb);
    }

}

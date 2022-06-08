package boj.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class 그룹_단어_체커 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            if (groupWordCheck((br.readLine()))) count++;
        }
        br.close();
        System.out.println(count);
    }

    private static boolean groupWordCheck(String word) {
        Set<Character> characters = new HashSet<>();
        int wordLength = word.length();

        if (wordLength == 1) return true;

        int sameCount = 0;
        for (int i = 0; i < word.length(); i++) {

            if (characters.contains(word.charAt(i))) return false;

            char[] chars = word.toCharArray();
            characters.add(chars[i]);

            for (int j = i + 1; j < wordLength; j++) {
                if (chars[i] != chars[j]) {
                    break;
                }
                sameCount++;
            }
            i += sameCount;
            sameCount = 0;
        }
        return true;
    }
}

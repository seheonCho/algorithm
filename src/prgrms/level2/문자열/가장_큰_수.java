package prgrms.level2.문자열;

import java.util.Arrays;

public class 가장_큰_수 {

    public String solution(int[] numbers) {

        int numbersLength = numbers.length;
        String[] convertedWords = new String[numbersLength];

        for (int i = 0; i < numbers.length; i++) {
            convertedWords[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(convertedWords, (a, b) -> - (a + b).compareTo(b + a));

        // TC 11번 예외
        if (convertedWords[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String convertedWord : convertedWords) {
            sb.append(convertedWord);
        }

        return sb.toString();
    }

}

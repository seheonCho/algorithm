package prgrms.level2.연습문제;

public class 다음_큰_숫자 {

    private static final char ONE = '1';

    public int solution(int n) {
        int answer = n;
        String originalBinaryString = Integer.toBinaryString(n);
        int originalOneCount = getCountOfOne(originalBinaryString);

        int result = Integer.MIN_VALUE;

        while (true) {
            answer++;

            String binaryString = Integer.toBinaryString(answer);
            int countOfOne = getCountOfOne(binaryString);
            if (countOfOne == originalOneCount) {
                result = answer;
                break;
            }

        }

        return result;
    }

    private int getCountOfOne(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char aChar = str.charAt(i);
            if (aChar == ONE) {
                count++;
            }
        }
        return count;
    }

}

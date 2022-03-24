package prgrms.level1.연습문제;

public class 자릿수_더하기 {

    public int solution(int n) {
        int answer = 0;
        char[] strN = Integer.toString(n).toCharArray();

        for (char str : strN) {
            answer += Character.getNumericValue(str);
        }

        return answer;
    }

}

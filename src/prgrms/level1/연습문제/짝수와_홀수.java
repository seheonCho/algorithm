package prgrms.level1.연습문제;

public class 짝수와_홀수 {

    public String solution(int num) {
        String odd = "Odd";
        String even = "Even";

        if (num == 0 || num % 2 == 0) {
            return even;
        }
        return odd;
    }

}

package prgrms.level1.연습문제;

public class 정수_제곱근_판별 {

    public long solution(long n) {

        long sqrt = (long) Math.sqrt(n);

        if (n == Math.pow(sqrt, 2)) {
            return (long) (Math.pow(sqrt+1, 2));
        } else {
            return -1;
        }

    }

}

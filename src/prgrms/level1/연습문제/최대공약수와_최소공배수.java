package prgrms.level1.연습문제;

public class 최대공약수와_최소공배수 {

    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int gcd = gcd(n, m);
        answer[0] = gcd;
        answer[1] = lcmFromGcd(n, m, gcd);

        return answer;
    }

    private static int lcmFromGcd(int a, int b, int gcd) {
        return a * b / gcd;
    }

    // 최대공약수, 유클리즈 호제법
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}

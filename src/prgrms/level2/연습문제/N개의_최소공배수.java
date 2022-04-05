package prgrms.level2.연습문제;

public class N개의_최소공배수 {

    public int solution(int[] arr) {
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++){
            int gcd = gcd(answer, arr[i]);
            answer = answer * arr[i] / gcd;
        }

        return answer;
    }

    private int gcd(int a, int b){
        int bigNum = Math.max(a, b);
        int smallNum = Math.min(a, b);

        while (bigNum % smallNum != 0){
            int r = bigNum % smallNum;
            bigNum = smallNum;
            smallNum = r;
        }

        return smallNum;
    }

}

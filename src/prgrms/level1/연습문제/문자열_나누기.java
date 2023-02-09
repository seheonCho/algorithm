package prgrms.level1.연습문제;

public class 문자열_나누기 {

    public int solution(String s) {
        String[] inputs = s.split("");
        int length = inputs.length;
        if (length == 0) {
            return 0;
        }

        int answer = 0;
        int idx = 0;

        int targetCount = 0;
        int nowCount = 0;
        String target = null;

        while (idx < length) {
            if (target == null || targetCount == nowCount) {
                target = inputs[idx];
                answer++;
                targetCount = 1;
                nowCount = 0;
                idx++;
                continue;
            }

            if (target.equals(inputs[idx])) {
                targetCount++;
            } else {
                nowCount++;
            }

            idx++;
        }

        return answer;
    }

}

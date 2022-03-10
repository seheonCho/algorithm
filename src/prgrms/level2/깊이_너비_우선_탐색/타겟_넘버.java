package prgrms.level2.깊이_너비_우선_탐색;

public class 타겟_넘버 {

    int maxDepth;
    int answer = 0;

    public int solution(int[] numbers, int target) {
        maxDepth = numbers.length;
        dfs (0, numbers, target, 0);
        return answer;
    }

    private void dfs(int depth, int[] numbers, int target, int sum) {

        // dfs 종료 조건 명시!!, numbers.length 를 static 두었다가 디버깅하다가 뺐음.
        if (depth == maxDepth) {
            if (target == sum) answer++;
        } else {
            //탐색할 깊이가 더 존재하면, 문제는 더하거나, 빼는 조건이 존재 하기때문에
            // 그래프의 깊이(depth)와 누적합(sum)을 추가해주면서 마지막depth까지.
            dfs(depth + 1, numbers, target, sum + numbers[depth]);
            dfs(depth + 1, numbers, target, sum - numbers[depth]);
        }

    }

}

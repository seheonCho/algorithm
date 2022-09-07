package prgrms.level1.월간코드챌린지;

public class 나머지가_1이_되는_수_찾기 {

    class Solution {
        public int solution(int n) {

            for (int i = 2; i < n; i++) {
                int num = n % i;
                if (num == 1) {
                    return i;
                }
            }
            return n - 1;
        }
    }
}

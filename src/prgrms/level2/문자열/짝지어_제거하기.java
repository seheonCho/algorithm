package prgrms.level2.문자열;

import java.util.Stack;

public class 짝지어_제거하기 {

    public int solution(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(ch);
            } else {
                char peek = stack.peek();
                if (ch == peek) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        if (stack.isEmpty()) {
            return 1;
        }
        return 0;
    }

}

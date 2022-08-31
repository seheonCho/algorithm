package prgrms.level2.스택_큐;

import java.util.Stack;

public class 올바른_괄호 {

    boolean solution(String s) {

        int sLen = s.length();
        final char OPEN = '(';

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < sLen; i++) {
            char target = s.charAt(i);

            if (target == OPEN) {
                stack.push(target);
            } else {

                if (stack.isEmpty()) return false;
                char last = stack.peek();

                if (last == OPEN) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if (stack.isEmpty())
            return true;
        else
            return false;

    }

}

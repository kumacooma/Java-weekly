package weekly4;

import java.util.Stack;

public class Matching {
    public static boolean isMatched(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false; // 스택이 비어있거나 매치되는 '('가 없는 경우
                }
            }
        }

        return stack.isEmpty(); // 스택이 비어있어야 모든 '('가 매치됨
    }


}
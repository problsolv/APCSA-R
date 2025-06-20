/**
 * TESTING PLATFORM B
 */
import java.util.Stack;
public class PlatformB {
    public static void main(String [ ] args) {
        System.out.println(infixToPostfix("9+5*6-(3+2)/4"));
    }

    static String infixToPostfix(String str) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }

    static int precedence(char c) {
        if (c == '^') return 2;
        else if (c == '+' || c == '-') return 0;
        else if (c == '*' || c == '/') return 1;
        return -1;
    }
}
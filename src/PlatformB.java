/**
 * TESTING PLATFORM B
 */
import java.util.Stack;
public class PlatformB {
    public static void main(String [ ] args) {
        String s = "9+5*6-(3+2)/4";
        System.out.println(infixToPostfix(s));
        System.out.println(infixToPrefix(s));
        /*
        9+5*6-(3+2)/4
        -+9*56/+324
        956*+32+4/-
         */
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
    static String infixToPrefix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        // scan from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            else if (c == ')') {
                st.push(c);
            }
            else if (c == '(') {
                while (!st.isEmpty() && st.peek() != ')') {
                    result.append(st.pop());
                }
                if (!st.isEmpty()) st.pop();
            }
            else if (precedence(c) >= 0) {
                while (!st.isEmpty() && precedence(st.peek()) >= 0 &&
                        (precedence(st.peek()) > precedence(c) ||
                                (precedence(st.peek()) == precedence(c) && c == '^'))) {
                    result.append(st.pop());
                }
                st.push(c);
            }
        }

        // pop remaining operators
        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        // reverse to get correct prefix
        return result.reverse().toString();
    }

    static int precedence(char c) {
        if (c == '^') return 2;
        else if (c == '+' || c == '-') return 0;
        else if (c == '*' || c == '/') return 1;
        return -1;
    }
}
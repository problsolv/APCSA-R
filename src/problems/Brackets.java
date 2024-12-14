package problems;
import java.util.*;
public class Brackets {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        Stack<Brackets> stack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            char next = text.charAt(i);
            if (next == '(' || next == '[' || next == '{') stack.push(new Brackets(next, i));
            if (next == ')' || next == ']' || next == '}') {
                if (stack.empty()) {
                    System.out.println(i + 1);
                    return;
                }
                char top = stack.pop().type;
                if ((top == '[' && next != ']') || (top == '(' && next != ')') || (top == '{' && next != '}')) {
                    System.out.println(i + 1);
                    return;
                }
            }
        }
        System.out.println(stack.isEmpty() ? "Success" : stack.get(0).position + 1);
    }

    static Stack<Integer> deleteMid(Stack<Integer> stack) {
        int mid = stack.size() / 2;
        Stack<Integer> temp = new Stack<>();
        for (int i = 0; i < mid; i++) temp.push(stack.pop());
        stack.pop();
        while (!temp.isEmpty()) stack.push(temp.pop());
        return stack;
    }

    static boolean balanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            if (c == ')' || c == ']' || c == '}') {
                if (stack.empty()) return false;
                char top = stack.pop();
                if ((top == '[' && c != ']') || (top == '(' && c != ')') || (top == '{' && c != '}')) return false;
            }
        }
        return stack.isEmpty();
    }


    final char type;
    final int position;
    Brackets(char type, int position) {
        this.type = type;
        this.position = position;
    }
}
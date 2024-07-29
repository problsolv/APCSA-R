package problems;
import java.util.*;
public class StackWithMax extends Stack<Integer> {
    Stack<Integer> max = new Stack<>();
    void push(int x) {
        if (isEmpty()) {
            super.push(x);
            max.push(x);
        }
        else {
            super.push(x);
            int y = max.pop();
            max.push(y);
            max.push(Math.max(x, y));
        }
    }

    public Integer pop() {
        int x = super.pop();
        max.pop();
        return x;
    }

    int max() {
        int x = max.pop();
        max.push(x);
        return x;
    }

    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        StackWithMax stack = new StackWithMax();
        for (int i = 0; i < q; i++) {
            String o = sc.next();
            if ("push".equals(o)) stack.push(sc.nextInt());
            else if ("pop".equals(o)) stack.pop();
            else if ("max".equals(o)) System.out.println(stack.max());
        }
    }
}
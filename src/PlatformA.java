import java.util.*;
/**
 * TESTING PLATFORM A
 */
public class PlatformA {

    static class Node {
        char val;
        Node next;
        Node(char v, Node n) {
            val = v;
            next = n;
        }
    }

    static class Stack implements Iterable<Character> {
        Node top;
        void push(char c) {
            top = new Node(c, top);
        }
        char peek() {
            return top.val;
        }
        boolean isEmpty() {
            return top == null;
        }

        void pop() {
            top = top.next;
        }

        void clear() {
            top = null;
        }

        void duplicate() {
            if (top == null) return;

            Node cur = top;
            Node tail = null;

            while (cur != null) {
                tail = new Node(cur.val, tail);
                cur = cur.next;
            }

            Node t = tail;
            while (t != null) {
                push(t.val);
                t = t.next;
            }
        }

        public Iterator<Character> iterator() {
            ArrayList<Character> list = new ArrayList<>();
            Node cur = top;
            while (cur != null) {
                list.add(cur.val);
                cur = cur.next;
            }
            Collections.reverse(list);
            return list.iterator();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        String st = sc.next().replace("67", "");

        for (char c : st.toCharArray()) {

            if (c == '6') stack.push(c);

            else if (c == '7') {
                if (!stack.isEmpty() && stack.peek() == '6') stack.pop();
                else stack.push(c);
            }

            else if (c == 'A') {
                Node cur = stack.top;
                Node rev = null;
                while (cur != null) {
                    rev = new Node(cur.val, rev);
                    cur = cur.next;
                }
                stack.top = rev;
            }

            else if (c == 'B') stack.duplicate();

            else if (c == '#') stack.clear();
        }

        if (stack.isEmpty()) System.out.println("EMPTY");
        else {
            StringBuilder res = new StringBuilder();
            for (char c : stack) res.append(c);
            System.out.println(res);
        }
    }
}

package problems;
import java.util.Scanner;
import java.util.Stack;
public class BinarySearchTree {
    static boolean isBinarySearchTree(Node[] tree) {
        Stack<Triple> stack = new Stack<>();
        stack.push(new Triple(Integer.MIN_VALUE, tree[0], Integer.MAX_VALUE));

        while (!stack.isEmpty()) {
            Triple triple = stack.pop();
            int min = triple.min, max = triple.max;
            Node root = triple.root;

            if (root.key < min || root.key >= max) {
                return false;
            }

            if (root.left != -1) {
                stack.push(new Triple(min, tree[root.left], root.key));
            }

            if (root.right != -1) {
                stack.push(new Triple(root.key, tree[root.right], max));
            }
        }
        return true;
    }

    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        if (n == 0 || isBinarySearchTree(nodes)) System.out.println("CORRECT");
        else System.out.println("INCORRECT");
    }

    static class Node {
        int key, left, right;

        public Node(int a, int b, int c) {
            key = a;
            left = b;
            right = c;
        }
    }

    static class Triple {
        int min, max;
        Node root;

        Triple(int min, Node root, int max) {
            this.min = min;
            this.root = root;
            this.max = max;
        }
    }
}
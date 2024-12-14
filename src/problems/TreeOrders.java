package problems;
import java.util.*;
import java.io.*;
public class TreeOrders {
	int[] key, left, right;

	private void read() {
		FastScanner sc = new FastScanner(System.in);
		key = new int[sc.nextInt()];
		left = new int[key.length];
		right = new int[left.length];
		for (int i = 0; i < right.length; i++) {
			key[i] = sc.nextInt();
			left[i] = sc.nextInt();
			right[i] = sc.nextInt();
		}
	}

	private void inOrderTraversal() {
		Stack<Integer> stack = new Stack<>();
		int currentId = 0;

		while (true) {
			if (currentId != -1) {
				stack.push(currentId);
				currentId = left[currentId];
			} else if (!stack.isEmpty()) {
				currentId = stack.pop();
				System.out.print(key[currentId] + " ");
				currentId = right[currentId];
			} else {
				break;
			}
		}
	}

	private void preOrderTraversal() {
		Stack<Integer> stack = new Stack<>();
		int currentId = 0;

		while (true) {
			if (currentId != -1) {
				System.out.print(key[currentId] + " ");
				stack.push(currentId);
				currentId = left[currentId];
			} else if (!stack.isEmpty()) {
				currentId = stack.pop();
				currentId = right[currentId];
			} else {
				break;
			}
		}
	}

	private void postOrderTraversal() {
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		stack1.push(0);

		while (!stack1.isEmpty()) {
			int currentId = stack1.pop();
			stack2.push(key[currentId]);

			int leftId = left[currentId];
			int rightId = right[currentId];
			if (leftId != -1) {
				stack1.push(leftId);
			}
			if (rightId != -1) {
				stack1.push(rightId);
			}
		}

		while (!stack2.isEmpty()) {
			System.out.print(stack2.pop() + " ");
		}
	}

	public static void main(String [ ] args) {
		TreeOrders tree = new TreeOrders();
		tree.read();
		tree.inOrderTraversal();
		System.out.println();
		tree.preOrderTraversal();
		System.out.println();
		tree.postOrderTraversal();
		System.out.println();
	}

	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;
		FastScanner(InputStream i) { br = new BufferedReader(new InputStreamReader(i)); }
		int nextInt() {
			while (st == null || !st.hasMoreElements()) {
				try { st = new StringTokenizer(br.readLine()); }
				catch (IOException e) { e.printStackTrace(); }
			}
			return Integer.parseInt(st.nextToken());
		}
	}
}
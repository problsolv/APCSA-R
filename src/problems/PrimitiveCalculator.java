package problems;
import java.util.Scanner;
public class PrimitiveCalculator {
    static int[] minOperations(int n) {
        int[] arr = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            int x = arr[i - 1], y, z;
            y = z = Integer.MAX_VALUE;

            if (i % 2 == 0) {
                y = arr[i / 2];
            }
            if (i % 3 == 0) {
                z = arr[i / 3];
            }

            arr[i] = Math.min(Math.min(x, y), z) + 1;
        }
        return arr;
    }

    static int[] getSequence(int[] arr, int n) {
        int key = n;
        int j = arr[n];

        int[] sequence = new int[j + 1];
        sequence[0] = 1;
        sequence[j] = key;

        for (int i = n; i >= 0; i--) {
            if (arr[i] == j - 1) {
                if (key - 1 == i) {
                    key--;
                    sequence[j - 1] = key;
                    j--;
                } else if (key % 2 == 0 && key / 2 == i) {
                    key /= 2;
                    sequence[j - 1] = key;
                    j--;
                } else if (key % 3 == 0 && key / 3 == i) {
                    key /= 3;
                    sequence[j - 1] = key;
                    j--;
                }

            }
        }
        return sequence;
    }

    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = minOperations(a);
        System.out.println(arr[a]);
        for (int i : getSequence(arr, a)) System.out.print(i + " ");
    }
}
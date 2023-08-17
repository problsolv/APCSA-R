package coursera;
import java.util.*;
public class BinarySearch {
    static int binarySearch(int[] a, int x) {
        int left = 0, right = a.length;
        while (left <= right) {
            int m = left + (right - left) / 2;
            if (m == a.length) break;
            if (a[m] == x) return m;
            else if (a[m] < x) left = m + 1;
            else right = m - 1;
        }
        return -1;
    }

    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[sc.nextInt()];
        for (int i = 0; i < b.length; i++) {
          b[i] = sc.nextInt();
        }
        for (int j : b) System.out.print(binarySearch(a, j) + " ");
    }
}
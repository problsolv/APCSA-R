import java.util.*;
/**
 * TESTING PLATFORM B
 */
public class PlatformB {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] r = new int[a][a];
        int k = 0, n = r.length / 2;
        for (int i = 1; i <= a * a; i++) {
            if (r[k][n] != 0) {
                if (k + 2 == a) k = 0;
                else if (k + 2 == a + 1) k = 1;
                else k += 2;
                n--;
                if (n == -1) n = a - 1;
                if (k == a) k = 0;
            }
            r[k][n] = i;
            k--;
            n++;
            if (k < 0) k = a - 1;
            if (n == a) n = 0;
        }
        for (int[] i : r) {
            for (int j : i) {
                if (j < 10) System.out.print("00" + j + " ");
                else if (j < 100) System.out.print("0" + j + " ");
                else System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
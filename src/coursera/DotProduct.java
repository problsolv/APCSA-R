package coursera;
import java.util.*;
public class DotProduct {
    static long maxDotProduct(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        long result = 0;
        for (int i = 0; i < a.length; i++) {
            result += (long)a[i] * (long)b[i];
        }
        return result;
    }

    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n], b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(maxDotProduct(a, b));
    }
}


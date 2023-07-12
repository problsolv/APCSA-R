package coursera;
import java.util.*;
public class FibonacciHuge {
    static long getFibonacciHuge(long n, long m) {
        int[] f = new int[(int) m + 1];
        f[0] = 0;
        f[1] = 1;
        for (long i = 2; i < f.length; i++) {
            f[(int)i] = (f[(int)i - 1] + f[(int)i - 2]) % 10;
        }
        int sum = 0;
        for (long i = n; i <= m; i++) {
            sum += f[(int)i];
            sum %= 10;
        }
        return sum % 10;
    }
    
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong(), n = sc.nextLong();
        System.out.println(getFibonacciHuge(m, n));
    }
}
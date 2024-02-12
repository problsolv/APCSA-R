/**
 * TESTING PLATFORM A
 */
public class PlatformA {
    static long step = 0;
    public static void main(String [ ] args) {
        int a = 45;
        for (int i = 1; i <= a; i++) {
            System.out.printf("f1(%2d) = %9d -- step = %10d%10s(%2d) = %9d -- step = %2d%n", i, f1(i), step, "f2", i, f2(i), step);
            step = 0;
        }
    }

    static long f1(int n) {
        step++;
        if (n <= 2) return n - 1;
        return f1(n - 1) + f1(n - 2);
    }

    static long f2(int n) {
        step = 0;
        n--;
        if (n <= 1) {
            step++;
            return n;
        }
        long[] fib = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            step++;
            fib[i] = (i <= 1) ? i : fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }
}
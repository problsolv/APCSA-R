/**
 * TESTING PLATFORM A
 */
public class PlatformA {
    static long step1 = 0, step2 = 0;
    public static void main(String [ ] args) {
        for (int i = 0; i <= 50; i++) {
            System.out.printf("f1(%2d) = %11d -- step = %12d%10s(%2d) = %11d -- step = %2d%n", i, f1(i), step1, "f2", i, f2(i), step2);
            step1 = 0;
            step2 = 0;
        }
    }

    static long f1(final int n) {
        step1++;
        return (n <= 1) ? n : f1(n - 1) + f1(n - 2);
    }

    static long f2(final int n) {
        if (n <= 1) {
            step2++;
            return n;
        }
        final long[] FIB = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            step2++;
            FIB[i] = (i <= 1) ? i : FIB[i - 1] + FIB[i - 2];
        }
        return FIB[n];
    }
}
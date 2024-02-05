/**
 * TESTING PLATFORM A
 */
public class PlatformA {
    static long step = 0;
    public static void main(String [ ] args) throws InterruptedException {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ". " + fibonacci(i) + " -- " + step);
            step = 0;
        }
        System.out.println("\n");
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + ". " + f(i) + " -- " + step);
            step = 0;
        }
    }

    static long f(int n) {
        step++;
        if (n <= 2) return n - 1;
        return f(n - 1) + f(n - 2);
    }

    static long fibonacci(int n) {
        step += 2;
        n--;
        if (n <= 1) return n;
        long[] fib = new long[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            step++;
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }
}
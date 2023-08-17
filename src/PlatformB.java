import java.util.Scanner;
/**
 * TESTING PLATFORM B
 */
public class PlatformB {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(f(a));
        System.out.println(fa(a));
        sc.close();
    }

    static long f(int x) {
        if (x <= 1) return 0;
        long[] a = new long[x];
        a[1] = 1;
        for (int i = 2; i < a.length; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[x - 1];
    }

    static long fa(int x) {
        if (x <= 0) return 0;
        if (x <= 2) return x - 1;
        return fa(x - 1) + fa(x - 2);
    }
}
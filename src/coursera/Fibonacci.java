package coursera;
import java.util.Scanner;
public class Fibonacci {
    public static long fibonacci(long a) {
        if (a <= 1) return a;
        long[] arr = new long[(int) (a + 1)];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= a; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[(int) a];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fibonacci(sc.nextLong()));
    }
}
package problems;
import java.util.Scanner;
public class LCM {
    public static long gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static long lcm(int a, int b) {
        return (long) a * b / gcd(a, b);
    }

    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(lcm(sc.nextInt(), sc.nextInt()));
    }
}
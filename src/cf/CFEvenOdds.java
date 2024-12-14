package cf;
import java.util.Scanner;
public class CFEvenOdds {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), k = sc.nextLong();
        if (n % 2 == 0) {
            if (k <= n / 2) System.out.println(2 * k - 1);
            else System.out.println(2 * (k - n / 2));
        }
        else {
            if (k <= n / 2 + 1) System.out.println(2* k - 1);
            else System.out.println(2 * (k - n / 2 - 1));
        }
    }
}
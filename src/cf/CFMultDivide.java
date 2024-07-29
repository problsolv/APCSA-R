package cf;
import java.util.*;
public class CFMultDivide {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            long n = sc.nextInt(), s = 0;
            while (n > 1) {
                if (n % 6 == 0) n /= 6;
                else n *= 2;
                s++;
            }
            System.out.println(n == 1 ? s : -1);
        }
    }
}
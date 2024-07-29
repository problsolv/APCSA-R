package cf;
import java.util.*;
public class CFNewYearNumber {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            int d = n / 2020;
            int r = n % 2020;
            if (d >= r) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
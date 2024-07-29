package cf;
import java.util.*;
public class CFFairPlay {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            if (Math.max(a, b) < Math.min(c, d) || Math.min(a, b) > Math.max(c, d)) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
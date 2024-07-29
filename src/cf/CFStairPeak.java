package cf;
import java.util.*;
public class CFStairPeak {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if (a < b && b < c) System.out.println("STAIR");
            else if (a < b && b > c) System.out.println("PEAK");
            else System.out.println("NONE");
        }
    }
}
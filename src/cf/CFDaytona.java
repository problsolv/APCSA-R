package cf;
import java.util.*;

public class CFDaytona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt(), k = sc.nextInt();
            boolean flag = false;
            while (n-->0) {
                if (sc.nextInt() == k && !flag) {
                    System.out.println("YES");
                    flag = true;
                }
            }
            if (!flag) System.out.println("NO");
        }
    }
}
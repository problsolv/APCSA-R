package problems;
import java.util.*;
public class MaxProduct {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = new long[sc.nextInt()];
        for (int i = 0; i < a.length; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        System.out.println(a[a.length - 1] * a[a.length - 2]);
    }
}
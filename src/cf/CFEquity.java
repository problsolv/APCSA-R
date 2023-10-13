package cf;
import java.util.*;
public class CFEquity {
  public static void main(String [ ] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[sc.nextInt()];
    for (int i = 0; i < a.length; i++) a[i] = sc.nextInt();
    Arrays.sort(a);
    int s = 0;
    for (int i = 0; i < a.length - 1; i++) s += (a[a.length - 1] - a[i]);
    System.out.println(s);
  }
}